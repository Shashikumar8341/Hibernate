package com.src.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "College")
public class College {
	@Id
	@GeneratedValue
	@Column(name = "c_id")
	private int id;
	@Column(name = "c_name")
	private String name;

//	@OneToMany
//	List<Branch> branchs;

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	public College(int id, String name, List<Branch> branchs) {
		super();
		this.id = id;
		this.name = name;
//		this.branchs = branchs;
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

//	public List<Branch> getBranchs() {
//		return branchs;
//	}
//
//	public void setBranchs(List<Branch> branchs) {
//		this.branchs = branchs;
//	}

	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", branchs="  + "]";
	}
}
