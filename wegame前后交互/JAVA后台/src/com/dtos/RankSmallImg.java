package com.dtos;

public class RankSmallImg {
	private int id;
	//��һ������ʾ������ͼ�꣬���ǵ�һ������ʾ��Ӧ������
	private int typeInt;
	//Сͼ��
	private String icon;
	//	����
	private int num;
	//СͼƬ
	private String smallImg;
	//С����
	private String title;
	//���ѷ�ʽ
	private String pay;
	//0:û�� 1:����  2:����
	private int arrowtype;
	//��ͷͼ��
	private String arrowIcon;
	public RankSmallImg(){
		
	}
	public RankSmallImg(int id, int typeInt, String icon, int num, String smallImg, String title, String pay,
			int arrowtype, String arrowIcon) {
		super();
		this.id = id;
		this.typeInt = typeInt;
		this.icon = icon;
		this.num = num;
		this.smallImg = smallImg;
		this.title = title;
		this.pay = pay;
		this.arrowtype = arrowtype;
		this.arrowIcon = arrowIcon;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTypeInt() {
		return typeInt;
	}
	public void setTypeInt(int typeInt) {
		this.typeInt = typeInt;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getSmallImg() {
		return smallImg;
	}
	public void setSmallImg(String smallImg) {
		this.smallImg = smallImg;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPay() {
		return pay;
	}
	public void setPay(String pay) {
		this.pay = pay;
	}
	public int getArrowtype() {
		return arrowtype;
	}
	public void setArrowtype(int arrowtype) {
		this.arrowtype = arrowtype;
	}
	public String getArrowIcon() {
		return arrowIcon;
	}
	public void setArrowIcon(String arrowIcon) {
		this.arrowIcon = arrowIcon;
	}
	
	
	
	
	
}
