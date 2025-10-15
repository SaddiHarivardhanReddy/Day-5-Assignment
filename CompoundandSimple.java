package com.codegnan.fundamentals;

import java.util.Scanner;

public class CompoundandSimple {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Principle amount:");
		double p=s.nextDouble();
		System.out.println("Enter Rate of Intrest %:");
		double r=s.nextDouble();
		System.out.println("Enter Time in months:");
		int t=s.nextInt();
		double timeinYears=(double)t/12;
		double simpleIntrest=(p*r*timeinYears)/100;
		double totalAmount=simpleIntrest+p;
		System.out.println("Simple Intrest is:"+simpleIntrest+"and Total Amount is:"+totalAmount);
		double amount=p*(Math.pow((1+r/100),timeinYears));
		double compoundInterest=amount-p;
		double ctotalAmount=compoundInterest+p;
		System.out.println("Compound Interest is:"+compoundInterest+"and Total Amount is:"+ctotalAmount);
		s.close();
	}

}
