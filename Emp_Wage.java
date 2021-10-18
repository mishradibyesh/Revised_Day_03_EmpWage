package com.bl.empwage;

import java.util.ArrayList;

public class Emp_Wage {
	static CalculateWage calc = new CalculateWage();     // creating reference variable for class calculatewage
	static CalculateWage calc2 = new CalculateWage(); // creating 2nd reference variable for class calculatewage
	public static void main(String[] args) {
		System.out.println("Welcome to EMPLOYEE WAGE COMPUTAION PROGRAM");
		
		Emp_Wage obj = new Emp_Wage();                // 
		calc.EmpWageBuilder("FlipKart",50,25,100);
		calc2.EmpWageBuilder("dmart",33,24,100);
        obj.addToArrayList();
	
	}
	public void addToArrayList() {
		ArrayList<CalculateWage> data = new ArrayList<CalculateWage>();   // to store wages of different companies 
		data.add(calc) ;                            // storing the the calculatewage objects in arrayList
		data.add(calc2);                       // storing the the calculatewage objects in arrayList
		for(int i = 0; i<2 ; i++ ) {               // printing the wages of different comapanies
			System.out.println(data.get(i));
		}
	}
}
