package com.bl.empwage;

import java.util.ArrayList;

public class Emp_Wage {
	public static void main(String[] args) {
		System.out.println("Welcome to EMPLOYEE WAGE COMPUTAION PROGRAM");
		CalculateWage[] data = new CalculateWage[2];   // to store wages of different companies 
		CalculateWage calc = new CalculateWage(); // creating reference variable for class calculatewage
		calc.EmpWageBuilder("FlipKart",50,25,100);
		data[0] = calc ;                            // storing the the calculatewage objects in array
		CalculateWage calc2 = new CalculateWage(); // creating 2nd reference variable for class calculatewage
		calc2.EmpWageBuilder("dmart",33,24,100);
		data[1] = calc2 ;                          // storing the the calculatewage objects in array

		for(int i = 0; i<2 ; i++ ) {               // printing the wages of different comapanies
			System.out.println(data[i]);
		}
	}
}
