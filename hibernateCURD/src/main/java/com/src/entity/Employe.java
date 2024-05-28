package com.src.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employe")
public class Employe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "age")
	private int age;
	@Column(name = "first")
	private String first;
	@Column(name = "last")
	private String last;

	public Employe() {
		super();
	}

	public Employe(int id, int age, String first, String last) {
		super();
		this.id = id;
		this.age = age;
		this.first = first;
		this.last = last;
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
