package com.example.jsondbpractice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	public User() {
		
	}
	
	 public User(int id, String first, String last) {
		super();
		this.id = id;
		this.first = first;
		this.last = last;
	}
	 @Id
	private int id;
	 private String first;
	 private String last;
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

}

