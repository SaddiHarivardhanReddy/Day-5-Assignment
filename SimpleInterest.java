package com.codegnan.fundamentals;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter principle amount");
		double p=s.nextDouble();
		System.out.println("enter time period");
		double t=s.nextDouble();
		System.out.println("enter rate of interest");
		double r=s.nextDouble();
		double si=(p*t*r)/100;
		double ta=si+p;
		System.out.println("simple interest is "+si+"total amount is"+ta);
		s.close();
		
	}

}
