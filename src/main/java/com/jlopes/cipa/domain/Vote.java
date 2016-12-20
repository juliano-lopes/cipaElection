package com.jlopes.cipa.domain;

public class Vote {
	private int quantity;

	public Vote(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void add() {
		quantity++;
	}

}
