package com.src.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Student")
public class Student {
	@Id
	@GeneratedValue
	@Column(name = "s_id")
	private int id;
	@Column(name = "s_name")
	private String name;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "a_id", referencedColumnName = "a_id")
	private Address address;
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "s_id", referencedColumnName = "s_id")
	private List<Branch> branchs;
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "c_id", referencedColumnName = "c_id")
	private College college;
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "joint", joinColumns = @JoinColumn(name = "s_id"), inverseJoinColumns = @JoinColumn(name = "cu_id"))
	private List<Coures> couress;
	public Student(int id, String name, Address address, List<Branch> branchs, College college, List<Coures> couress) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.branchs = branchs;
		this.college = college;
		this.couress = couress;
	}
	public Student() {
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Branch> getBranchs() {
		return branchs;
	}
	public void setBranchs(List<Branch> branchs) {
		this.branchs = branchs;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public List<Coures> getCouress() {
		return couress;
	}
	public void setCouress(List<Coures> couress) {
		this.couress = couress;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", branchs=" + branchs + ", college="
				+ college + ", couress=" + couress + "]";
	}



}
