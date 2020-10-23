package kosta1200.todayroom.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.action.Action;
import kosta1200.todayroom.action.ActionForward;
import kosta1200.todayroom.action.MemberIdCheckList;
import kosta1200.todayroom.action.MemberLogin;
import kosta1200.todayroom.action.MemberLogin_Action;
import kosta1200.todayroom.action.MemberLogout;
import kosta1200.todayroom.action.MemberNickNameCheck;
import kosta1200.todayroom.action.MemberSecession;
import kosta1200.todayroom.action.MemberSignup_Action;
import kosta1200.todayroom.action.MemberUpdate_Action;
import kosta1200.todayroom.action.MemberUpdate_form;


@WebServlet("/Member/*")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MemberController() {
        super();
    }
    

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length()+8);
		Action action = null;
		ActionForward forward = null;
		
		System.out.println(command);
		System.out.println("1");

		if (command.equals("MemberIdCheckList.do")) {//아이디 중복체크
			try {
				action=new MemberIdCheckList();
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("MemberNickNameCheck.do")){//별명중복확인
			try {
				action=new MemberNickNameCheck();
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("MemberSignup_Action.do")) {//회원가입버튼 클릭
			try {
				action=new MemberSignup_Action();
				forward=action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}		
		}else if(command.equals("MemberLogin_Action.do")) {//로그인 폼이동
			try {
				action=new MemberLogin_Action();
				forward=action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}		
		}else if(command.equals("MemberLogin.do")) {//로그인 버튼클릭
			try {
				action=new MemberLogin();
				forward=action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}		
		}else if(command.equals("MemberLogout.do")) {
			try {
				action=new MemberLogout();
				forward=action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}		
		}else if(command.equals("MemberUpdate_form.do")) {
			try {
				action=new MemberUpdate_form();
				forward=action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}else if(command.equals("MemberUpdate_Action.do")) {
			try {
				action=new MemberUpdate_Action();
				forward=action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}else if(command.equals("MemberSecession.do")) {
			try {
				action=new MemberSecession();
				forward=action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
			
    	if(forward!=null) {
    		if(forward.isRedirect()) {
    			response.sendRedirect(forward.getPath());
    		}else {
    			RequestDispatcher dispatcher=request.getRequestDispatcher(forward.getPath());
    			dispatcher.forward(request, response);
			}
    	}

	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

}
