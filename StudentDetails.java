package com.codegnan.fundamentals;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter student name:");
		String name=s.next();
		System.out.print("enter student rollnumber");
		int rollnumber=s.nextInt();
		System.out.print("enter student age");
		int age=s.nextInt();
		System.out.print("enter grade");
		String grade=s.next();
		System.out.println("Student Details");
		System.out.println("student name:"+name);
		System.out.println("student rollnumber:"+rollnumber);
		System.out.println("student age:"+age);
		System.out.println("grade:"+grade);
		s.close();
	}

}
