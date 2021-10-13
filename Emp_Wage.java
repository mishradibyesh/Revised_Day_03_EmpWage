package com.bl.empwage;

public class Emp_Wage {
	public static void main(String[] args) {	
		System.out.println("Welcome to EMPLOYEE WAGE COMPUTAION PROGRAM");
		int Is_Present = (int)Math.floor(Math.random() * 10) % 2;                //generating random number i.e 0 or 1
		if(Is_Present == 1)                                                 // checking presence with the help of if condition
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent"); }
}
