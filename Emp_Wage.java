package com.bl.empwage;

public class Emp_Wage {
	static final int FULLTIME = 1;
	static final int  PART_TIME = 2;
	public static void main(String[] args) {
		System.out.println("Welcome to EMPLOYEE WAGE COMPUTAION PROGRAM");
		int Random=(int)Math.floor(Math.random()*10) % 3;                 //GENERATING random values
		int salary = 0;
		int FullDayHour = 0;
		int WagePerHour = 0;
		switch (Random)                                // checking presence with the help of switch statement
		{	
		case FULLTIME:

			FullDayHour = 8;
			WagePerHour = 20;
			System.out.print("Employee is full time and ");
			break;
		case PART_TIME:

			FullDayHour = 4;
			WagePerHour = 20;
			System.out.print("Employee is part time and ");
			break;

		default : 

			FullDayHour = 0;
			WagePerHour = 0;
			System.out.print("Employee is absent and ");
		}             
		salary+= WagePerHour * FullDayHour;                             // calculating salary
		System.out.println("his income is Rs."+salary);
	}
}