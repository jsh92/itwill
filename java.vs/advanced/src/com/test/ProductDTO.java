package com.test;

import com.sun.jmx.snmp.Timestamp;

public class ProductDTO {
	private int no;
	private String pdName;
	private int price;
	private String desc;
	private Timestamp regdate;
	public ProductDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductDTO(int no, String pdName, int price, String desc, Timestamp regdate) {
		super();
		this.no = no;
		this.pdName = pdName;
		this.price = price;
		this.desc = desc;
		this.regdate = regdate;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getPdName() {
		return pdName;
	}
	public void setPdName(String pdName) {
		this.pdName = pdName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Timestamp getRegdate() {
		return regdate;
	}
	public void setRegdate(Timestamp regdate2) {
		this.regdate = regdate2;
	}
	@Override
	public String toString() {
		return "ProductDTO [no=" + no + ", pdName=" + pdName + ", price=" + price + ", desc=" + desc + ", regdate="
				+ regdate + "]";
	}
	
	
	
	
}
