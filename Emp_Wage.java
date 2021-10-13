package com.bl.empwage;

public class Emp_Wage {
	public static void main(String[] args) {
		System.out.println("Welcome to EMPLOYEE WAGE COMPUTAION PROGRAM");
		int Is_Present=(int)Math.floor(Math.random()*10)%2;                    //generating  random values 0 and 1
		int salary=0;
		if(Is_Present==1)                                                      // checking presence with the help of if condition
		{	
			int FullDayHour=8;
			int WagePerHour=20;
			salary+=WagePerHour*FullDayHour;
			System.out.println("Employee is present and his today's income is Rs. "+salary);

		}
		else
			System.out.println("Employee is absent and his today's income is Rs. "+salary);
	}
}
