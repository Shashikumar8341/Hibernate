package com.src.entity;

import javax.persistence.*;

@Entity
@Table(name = "Branch")
public class Branch {
	@Id
	@GeneratedValue
	@Column(name = "b_id")
	private int id;
	@Column(name = "b_name")
	private String name;
	public Branch(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Branch() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Branch [id=" + id + ", name=" + name + "]";
	}
	
}
