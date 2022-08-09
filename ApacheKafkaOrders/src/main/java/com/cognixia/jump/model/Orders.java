package com.cognixia.jump.model;

import java.io.Serializable;
import java.sql.Date;

public class Orders implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private Date timestamp;
	private String itemName;
	private int quantity;
	
	public Orders(){
		
	}

	public Orders(int id, Date timestamp, String itemName, int quantity) {
		super();
		this.id = id;
		this.timestamp = timestamp;
		this.itemName = itemName;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", timestamp=" + timestamp + ", itemName=" + itemName + ", quantity=" + quantity
				+ "]";
	}
	
	

}
