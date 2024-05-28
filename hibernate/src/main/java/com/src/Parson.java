package com.src;

public class Parson {
	int id;
	String name;
	Long phnumber;
	String date;
	
	public Parson() {
		super();
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


	public Long getPhnumber() {
		return phnumber;
	}


	public void setPhnumber(Long phnumber) {
		this.phnumber = phnumber;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "Parson [id=" + id + ", name=" + name + ", phnumber=" + phnumber + ", date=" + date + "]";
	}

}
