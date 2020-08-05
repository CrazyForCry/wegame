package com.dtos;

public class User {
	private int id;
	private String name;
	private String pass;
	private int points;
	
	public User(){
		
	}
	public User(String name,String pass){
		this.name=name;
		this.pass=pass;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}

	
}
