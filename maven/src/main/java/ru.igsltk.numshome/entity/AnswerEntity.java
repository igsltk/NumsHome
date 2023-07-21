package ru.igsltk.numhome;


public class AnswerEntity {
	private String time;
	private String answer;
	private String status;

	AnswerEntity(String t, String a, String s) {
		this.time = t;
		this.answer = a;
		this.status = s;
	}
	AnswerEntity(String a) {
		this.answer = a;
	}
}