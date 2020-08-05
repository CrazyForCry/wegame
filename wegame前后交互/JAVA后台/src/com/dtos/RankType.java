package com.dtos;

import java.util.ArrayList;
import java.util.List;

public class RankType {
	private int id;
	private String title;
	private String icon;
	private List<RankSmallImg> listrank= new ArrayList<RankSmallImg>();
	public RankType(){
		
	}
	public RankType(int id, String title, String icon, List<RankSmallImg> listrank) {
		super();
		this.id = id;
		this.title = title;
		this.icon = icon;
		this.listrank = listrank;
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
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public List<RankSmallImg> getListrank() {
		return listrank;
	}
	public void setListrank(List<RankSmallImg> listrank) {
		this.listrank = listrank;
	}
	
	
	
}
