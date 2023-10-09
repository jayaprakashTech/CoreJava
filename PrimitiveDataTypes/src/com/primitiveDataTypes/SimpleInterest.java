package com.primitiveDataTypes;
import java.math.BigDecimal;
public class SimpleInterest {

	private BigDecimal a;
	private BigDecimal b;
	public SimpleInterest(String principal, String interest) {
		this.a=new BigDecimal(principal);
		this.b = new BigDecimal(interest).divide(new BigDecimal(100));
	
	}

	BigDecimal calculateTotalValue(int i) {
		BigDecimal totalValue = this.a.add(this.a.multiply(this.b).multiply(new BigDecimal(i)));
		return totalValue;
	}

	}


