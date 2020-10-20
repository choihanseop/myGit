package kosta1200.todayroom.dto;

import java.io.Serializable;

public class Roomwarming implements Serializable {
	private int board_seq;
	private String roomwarming_classification;
	private String roomwarming_space;
	private String roomwarming_style;
	private String roomwarming_color;
	private String roomwarming_budget;
	
	public Roomwarming() {}

	public Roomwarming(int board_seq, String roomwarming_classification, String roomwarming_space,
			String roomwarming_style, String roomwarming_color, String roomwarming_budget) {
		super();
		this.board_seq = board_seq;
		this.roomwarming_classification = roomwarming_classification;
		this.roomwarming_space = roomwarming_space;
		this.roomwarming_style = roomwarming_style;
		this.roomwarming_color = roomwarming_color;
		this.roomwarming_budget = roomwarming_budget;
	}

	public int getBoard_seq() {
		return board_seq;
	}

	public void setBoard_seq(int board_seq) {
		this.board_seq = board_seq;
	}

	public String getRoomwarming_classification() {
		return roomwarming_classification;
	}

	public void setRoomwarming_classification(String roomwarming_classification) {
		this.roomwarming_classification = roomwarming_classification;
	}

	public String getRoomwarming_space() {
		return roomwarming_space;
	}

	public void setRoomwarming_space(String roomwarming_space) {
		this.roomwarming_space = roomwarming_space;
	}

	public String getRoomwarming_style() {
		return roomwarming_style;
	}

	public void setRoomwarming_style(String roomwarming_style) {
		this.roomwarming_style = roomwarming_style;
	}

	public String getRoomwarming_color() {
		return roomwarming_color;
	}

	public void setRoomwarming_color(String roomwarming_color) {
		this.roomwarming_color = roomwarming_color;
	}

	public String getRoomwarming_budget() {
		return roomwarming_budget;
	}

	public void setRoomwarming_budget(String roomwarming_budget) {
		this.roomwarming_budget = roomwarming_budget;
	}

	@Override
	public String toString() {
		return "Roomwarming [board_seq=" + board_seq + ", roomwarming_classification=" + roomwarming_classification
				+ ", roomwarming_space=" + roomwarming_space + ", roomwarming_style=" + roomwarming_style
				+ ", roomwarming_color=" + roomwarming_color + ", roomwarming_budget=" + roomwarming_budget + "]";
	}
	
	
}
