package com.practice;

public class Exception_Types {
	
	public void calculation() { 
		
		int a=1;
		int b=a/0;// any integer divided by zero the arithmetic error arises.
		System.out.println(b);
	}
		
	

	public static void main(String[] args) {
		
			Exception_Types et = new Exception_Types();
			et.calculation();
		
		
		

	

}}
