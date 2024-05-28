package com.src.entity;

import javax.persistence.*;

@Entity
@Table(name = "Address")
public class Address {
	@Id
	@GeneratedValue
	@Column(name = "a_id")
	private int id;
	@Column(name = "a_area")
	private String area;

	public Address(int id, String area) {
		super();
		this.id = id;
		this.area = area;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", area=" + area + "]";
	}

}
