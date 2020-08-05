package com.utils;

public class Result {
	//状态：0成功  -1失败
	private int state;
	//数据
	private Object data;
	//信息提示
	private String message;
	
	public Result(int state,String message){
		this.state = state;
		this.message = message;
	}

	public Result(int state, Object data, String message) {
		super();
		this.state = state;
		this.data = data;
		this.message = message;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
