package com.dtos;

public class ImageList {
	private int id;
	private String gameImg;
	private String title;
	private String descp;
	public ImageList(){
		
	}
	public ImageList(int id, String gameImg, String title, String descp) {
		super();
		this.id = id;
		this.gameImg = gameImg;
		this.title = title;
		this.descp = descp;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGameImg() {
		return gameImg;
	}
	public void setGameImg(String gameImg) {
		this.gameImg = gameImg;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescp() {
		return descp;
	}
	public void setDescp(String descp) {
		this.descp = descp;
	}

	
	
	
}
