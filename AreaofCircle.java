package com.codegnan.fundamentals;

import java.util.Scanner;

public class AreaofCircle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter r value");
		double r = s.nextDouble();
		double a = 3.14 * r * r;
		System.out.println("area od circle" + a);
		s.close();

	}

}
