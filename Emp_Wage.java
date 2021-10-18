package com.bl.empwage;

public class Emp_Wage {
	public static void main(String[] args) {
		System.out.println("Welcome to EMPLOYEE WAGE COMPUTAION PROGRAM");
		CalculateWage calc = new CalculateWage("dmart",50,30,120); // creating reference variable for class calculatewage
        System.out.println(calc);
        CalculateWage calc1 = new CalculateWage("FlipKart",50,25,100); // creating reference variable for class calculatewage
        System.out.println(calc1);
	}
}
