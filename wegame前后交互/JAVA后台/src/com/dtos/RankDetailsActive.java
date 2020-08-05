package com.dtos;

public class RankDetailsActive {
	private int aid;
	private String smallimg;
	private String titlename;
	private String descp;
	private int num;
	private String publishdate;
	private int activeid;
	
	public RankDetailsActive(){
		
	}

	public RankDetailsActive(int aid, String smallimg, String titlename, String descp, int num, String publishdate,
			int activeid) {
		super();
		this.aid = aid;
		this.smallimg = smallimg;
		this.titlename = titlename;
		this.descp = descp;
		this.num = num;
		this.publishdate = publishdate;
		this.activeid = activeid;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getSmallimg() {
		return smallimg;
	}

	public void setSmallimg(String smallimg) {
		this.smallimg = smallimg;
	}

	public String getTitlename() {
		return titlename;
	}

	public void setTitlename(String titlename) {
		this.titlename = titlename;
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

	public String getPublishdate() {
		return publishdate;
	}

	public void setPublishdate(String publishdate) {
		this.publishdate = publishdate;
	}

	public int getActiveid() {
		return activeid;
	}

	public void setActiveid(int activeid) {
		this.activeid = activeid;
	}
	
}
