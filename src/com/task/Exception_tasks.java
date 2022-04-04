package com.task;

public class Exception_tasks {

	
	public static void main(String[] args)
	{
	try
	{
	System.out.println("1");// 1 will print first
	int sum = 9 / 0;//here it is Arithmetic Exception, so it will enter into catch
	System.out.println("2");
	}
	catch(ArithmeticException e)
	{
	System.out.println("3");//3 will be printed in console due to Arithmetic Exception
	}
	catch(Exception e)
	{
	System.out.println("4");
	}
	finally
	{
	System.out.println("5");//it is present inside the finally block so it will also be printed 
	}
	}
	}

