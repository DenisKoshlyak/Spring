package model;

import java.math.BigDecimal;

public class Transfer {
	private int idSender;
	private int idReceiver;
	private BigDecimal balance;
	
	public BigDecimal getBalance() {
		return balance;
	}
	
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public int getIdSender() {
		return idSender;
	}

	public void setIdSender(int idSender) {
		this.idSender = idSender;
	}

	public int getIdReceiver() {
		return idReceiver;
	}

	public void setIdReceiver(int idReceiver) {
		this.idReceiver = idReceiver;
	}
}
