package com.techelevator;

import java.math.BigDecimal;

public class Gum extends Product {
	
	public Gum(String nameOfProduct, BigDecimal price) {
		super(nameOfProduct, price);
	}
	
	public String getSound() {	
		return "Chew Chew, Yum!";
	}

}
