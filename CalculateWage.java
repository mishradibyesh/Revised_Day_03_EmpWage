package com.bl.empwage;

public class CalculateWage {
	static final int FULLTIME = 1;
	static final int  PART_TIME = 2;
public CalculateWage() {
	int Monthly_salary = 0;
	int one_day = 0;
	int FullDayHour = 0;
	int WagePerHour = 0;
	int TotalWorkingHour=0;
	int day=1;
	while(TotalWorkingHour <=100 && day <=20) {		      // putting a condition to check for maximum hour and day allowed

		int Random=(int)Math.floor(Math.random()*10) % 3; //GENERATING numbers between 0 t0 2 for checking employee type

		switch (Random)                                                 // checking presence with the help of switch statement
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
		one_day= WagePerHour * FullDayHour;                                          // calculating salary
		System.out.println("his day "+day+" income is Rs."+one_day);                  // displaying daily earning
		Monthly_salary+= WagePerHour * FullDayHour;                                // calculating salary
		TotalWorkingHour+=FullDayHour;
		day++;
	}
	System.out.println("Employee's final working hour is  "+TotalWorkingHour); //printing the total working hour of employee
	System.out.println("Employee's monthly Income is Rs. "+Monthly_salary);      // displaying monthly salary
}
}
