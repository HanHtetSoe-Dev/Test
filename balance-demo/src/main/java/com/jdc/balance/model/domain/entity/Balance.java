package com.jdc.balance.model.domain.entity;

import java.io.Serializable;
import java.time.LocalDate;

public class Balance implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private LocalDate date;
	private String category;
	private User usr;
	private Type type;
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public LocalDate getDate() {
		return date;
	}



	public void setDate(LocalDate date) {
		this.date = date;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	public User getUsr() {
		return usr;
	}



	public void setUsr(User usr) {
		this.usr = usr;
	}



	public Type getType() {
		return type;
	}



	public void setType(Type type) {
		this.type = type;
	}



	public enum Type{
		Income,
		Expense
	}

}
