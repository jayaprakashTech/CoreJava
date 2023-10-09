package com.oops2;

public class Address {
	private String line;
	private String city;
	private String code;

	Address(String line, String city, String code) {
		this.line = line;
		this.city = city;
		this.code = code;
	}
@Override
public String toString() {
	return line + "  " + city + "  " + code;
}
}
