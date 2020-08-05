package com.dtos;

import java.util.ArrayList;
import java.util.List;

public class RankDetails {
	private int id;
	private String title;
	private String vedios;
	private String details;
	private int price;
	private String publishdate;
	private String smallimg;
	
	private List<RankDetailsActive> activeList = new ArrayList<RankDetailsActive>();
	public RankDetails(){
		
	}
	public RankDetails(int id, String title, String vedios, String details, List<RankDetailsActive> activeList,int price,String publishdate,String smallimg) {
		super();
		this.id = id;
		this.title = title;
		this.vedios = vedios;
		this.details = details;
		this.activeList = activeList;
		this.price = price;
		this.publishdate = publishdate;
		this.smallimg = smallimg;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getVedios() {
		return vedios;
	}
	public void setVedios(String vedios) {
		this.vedios = vedios;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public List<RankDetailsActive> getActiveList() {
		return activeList;
	}
	public void setActiveList(List<RankDetailsActive> activeList) {
		this.activeList = activeList;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPublishdate() {
		return publishdate;
	}
	public void setPublishdate(String publishdate) {
		this.publishdate = publishdate;
	}
	public String getSmallimg() {
		return smallimg;
	}
	public void setSmallimg(String smallimg) {
		this.smallimg = smallimg;
	}
	
	
}
