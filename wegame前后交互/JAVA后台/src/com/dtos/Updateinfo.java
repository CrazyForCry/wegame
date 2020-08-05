package com.dtos;

public class Updateinfo {
	private int id;
	private String bigimg;
	private String smallimg;
	private String title;
	private String category;
	private String info;
	private String descp;
	private int num;
	private String infodate;
	
	public Updateinfo(){
		
	}

	public Updateinfo(int id, String bigimg, String smallimg, String title, String category, String info, String descp,
			int num, String infodate) {
		super();
		this.id = id;
		this.bigimg = bigimg;
		this.smallimg = smallimg;
		this.title = title;
		this.category = category;
		this.info = info;
		this.descp = descp;
		this.num = num;
		this.infodate = infodate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBigimg() {
		return bigimg;
	}

	public void setBigimg(String bigimg) {
		this.bigimg = bigimg;
	}

	public String getSmallimg() {
		return smallimg;
	}

	public void setSmallimg(String smallimg) {
		this.smallimg = smallimg;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getDescp() {
		return descp;
	}

	public void setDescp(String descp) {
		this.descp = descp;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getInfodate() {
		return infodate;
	}

	public void setInfodate(String infodate) {
		this.infodate = infodate;
	}
	
	
}
