package com.java;

public class Emp_Address {
	int houseno;
	String street;
	String dist;
	long pin;
	public Emp_Address(int houseno, String street, String dist, long pin) {
		System.out.println("Emp_Address P.C.");
		this.houseno = houseno;
		this.street = street;
		this.dist = dist;
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Emp_Address [houseno=" + houseno + ", street=" + street + ", dist=" + dist + ", pin=" + pin + "]";
	}
	

}
