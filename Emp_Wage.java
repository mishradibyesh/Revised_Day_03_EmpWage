package com.bl.empwage;

import java.util.ArrayList;

public class Emp_Wage {
	public static void main(String[] args) {
		System.out.println("Welcome to EMPLOYEE WAGE COMPUTAION PROGRAM");
		ArrayList<CalculateWage> data = new ArrayList<CalculateWage>();
		CalculateWage calc = new CalculateWage(); // creating reference variable for class calculatewage
		calc.EmpWageBuilder("FlipKart",50,25,100);
		data.add(calc);
		CalculateWage calc2 = new CalculateWage(); // creating reference variable for class calculatewage
		calc2.EmpWageBuilder("dmart",33,24,100);
		data.add(calc2);
		for(int i =0 ;i< data.size();i++) {
			System.out.println(data.get(i));
		}

	}
}
