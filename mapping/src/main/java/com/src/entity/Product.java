package com.src.entity;

import javax.persistence.*;

@Entity

public class Product {
	@Id
	@GeneratedValue
private	int id;
	private String first;
	private	String last;
	private	int age;
	@OneToOne
	@JoinColumn(name = "m_id")
	private Member m;


	public Product(int id, String first, String last, int age) {
		super();
		this.id = id;
		this.first = first;
		this.last = last;
		this.age = age;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Member getM() {
		return m;
	}

	public void setM(Member m) {
		this.m = m;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", first=" + first + ", last=" + last + ", age=" + age + "]";
	}

}
