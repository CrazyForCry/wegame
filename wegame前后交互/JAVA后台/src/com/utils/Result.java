package com.utils;

public class Result {
	//״̬��0�ɹ�  -1ʧ��
	private int state;
	//����
	private Object data;
	//��Ϣ��ʾ
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
