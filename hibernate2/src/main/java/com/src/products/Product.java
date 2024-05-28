package com.src.products;

import java.util.Date;

public class Product {
	private Integer idproduct;
	private String p_name;
	private String p_packket;
	private String p_address;
	private Date date;

	public Product(Integer idproduct, String p_name, String p_packket, String p_address, Date date) {
		super();
		this.idproduct = idproduct;
		this.p_name = p_name;
		this.p_packket = p_packket;
		this.p_address = p_address;
		this.date = date;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIdproduct() {
		return idproduct;
	}

	public void setIdproduct(Integer idproduct) {
		this.idproduct = idproduct;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public String getP_packket() {
		return p_packket;
	}

	public void setP_packket(String p_packket) {
		this.p_packket = p_packket;
	}

	public String getP_address() {
		return p_address;
	}

	public void setP_address(String p_address) {
		this.p_address = p_address;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Product [idproduct=" + idproduct + ", p_name=" + p_name + ", p_packket=" + p_packket + ", p_address="
				+ p_address + ", date=" + date + "]";
	}

}
