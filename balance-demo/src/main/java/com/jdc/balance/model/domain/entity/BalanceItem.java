package com.jdc.balance.model.domain.entity;

import java.io.Serializable;

public class BalanceItem implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String item;
	private int unitPrice;
	private int quantity;
	private Balance balance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Balance getBalance() {
		return balance;
	}
	public void setBalance(Balance balance) {
		this.balance = balance;
	}
	
	
	
	
	
}
