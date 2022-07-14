package com.HashMap;

public class HashMap {
	private int Marks;
	private String Name;
	
	
	
	
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	public HashMap(int marks, String name) {
		super();
		Marks = marks;
		Name = name;
	}
	public HashMap() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "HashMap [Marks=" + Marks + ", Name=" + Name + "]";
	}

	

}
