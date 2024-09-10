package com.hw3.model.vo;

import com.hw3.controller.ProductController;

public class Product {
	
	
	private int pld; // 제품 번호
	private String pName; // 제품명
	private int price; // 제품 가격
	private double tax; // 제품 세금
	
	public Product() {
		// TODO Auto-generated constructor stub
		ProductController.count++;
	}

	public Product(int pld, String pName, int price, double tax) {
		this.pld = pld;
		this.pName = pName;
		this.price = price;
		this.tax = tax;
		
		ProductController.count++;
		
	}
	
	public String information() {
		return "\n제품번호 : " + pld +
				"\n제품명   : " + pName  +
				"\n제품가격 : " + price + "원"+ 
				"\n제품세금 : " + tax+ "\n";
	}

	public int getPld() {
		return pld;
	}

	public void setPld(int pld) {
		this.pld = pld;
	}

	public String getpNmae() {
		return pName;
	}

	public void setpNmae(String pNmae) {
		this.pName = pNmae;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	
}
