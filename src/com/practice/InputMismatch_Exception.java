package com.practice;

import java.util.Scanner;

public class InputMismatch_Exception {
	public void Calculation() {

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the numbers");
			int a = sc.nextInt();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}
	/*
	 * try { Integer i=1;
	 * 
	 * int[] a= new int[i]; a[0]=1; a[1]=2; }catch(Exception e) {
	 * e.printStackTrace();} }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InputMismatch_Exception ie = new InputMismatch_Exception();
		ie.Calculation();

	}

}
