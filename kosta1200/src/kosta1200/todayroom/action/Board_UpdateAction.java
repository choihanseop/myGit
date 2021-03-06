package kosta1200.todayroom.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.BoardService;
import kosta1200.todayroom.vo.BoardVO;

public class Board_UpdateAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		ActionForward forward = new ActionForward();
		BoardService service = BoardService.getInstance();

		int seq = Integer.parseInt(request.getParameter("board_seq"));
		BoardVO board = new BoardVO();
		
		board.setBoard_seq(seq);
		board.setBoard_thumbnail(request.getParameter("thumbnail_image"));	
		board.setBoard_title(request.getParameter("title"));
		board.setBoard_content(request.getParameter("content"));

		service.updateBoardService(board);
		
		String path = "listAction.do";
		forward.setPath(path);
		forward.setRedirect(true);
		
		return forward;
	}

}
