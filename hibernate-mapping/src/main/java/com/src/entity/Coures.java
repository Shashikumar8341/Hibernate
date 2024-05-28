package com.src.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Coures")
public class Coures {
	@Id
	@GeneratedValue
	@Column(name = "cu_id")
	private int id;
	@Column(name = "cu_name")
	private String name;


	public Coures() {
		super();
	}

	public Coures(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
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
		return "Coures [id=" + id + ", name=" + name + "]";
	}

}
