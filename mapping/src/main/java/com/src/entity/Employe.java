package com.src.entity;

import javax.persistence.*;

/**
 * 
 */
@Entity
@Table
public class Employe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private int age;
	@Column
	private String first;
	@Column
	private String last;

	public Employe(int id, int age, String first, String last) {
		super();
		this.id = id;
		this.age = age;
		this.first = first;
		this.last = last;
	}

	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	@Override
	public String toString() {
		return "Employe [id=" + id + ", age=" + age + ", first=" + first + ", last=" + last + "]";
	}

}
