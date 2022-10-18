package model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;

public class Account {
	@Id
	private int id;
	private String name;
	private BigDecimal balance;
	
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
	
	public BigDecimal getBalance() {
		return balance;
	}
	
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
}
