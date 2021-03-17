package com.example.productcatalogservice.DTO;

public class Product {
	
	private String id;
	private String title;
	private String desc;
	private String imagePath;
	private double unitPrice;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", title=" + title + ", desc=" + desc + ", imagePath=" + imagePath + ", unitPrice="
				+ unitPrice + "]";
	}
}