package com.codegnan.fundamentals;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter principle amount");
		double p=s.nextDouble();
		System.out.println("enter time period");
		double t=s.nextDouble();
		System.out.println("enter rate of interest");
		double r=s.nextDouble();
		double amount=p*(Math.pow(1 + r/100, t));
		double ci=amount-p;
		double ta=ci+p;
		System.out.println("compund interest is "+ci+"total amount is "+ta);
		s.close();

	}

}
