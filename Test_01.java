package com.java;

public class Test_01 {

	public static void main(String[] args) {
		System.out.println("shankar");
		int k=1;
		for (int i =1; i <5; i++) {
			for (int j =i; j>0; j--) {
				System.out.print(k+++" ");
			}
			System.out.println("");
		}
		System.out.println("=============");
	//====================================
		int k1=10;
		for (int i =4; i>0; i--) {
			
				for (int j2 = i; j2>0; j2--) {
					System.out.print(" ");
				}
				for (int j =i; j>0; j--) {
				System.out.print(k1-- +" ");
			}
			System.out.println("Kumar");
		}	
	}
}
