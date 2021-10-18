package com.bl.empwage;

public class CalculateWage implements InterfaceEmpWage {
	static final int FULLTIME = 1;
	static final int  PART_TIME = 2;
	String company;
	int monthly_salary = 0;
	int fullDayHour = 0;
	int wagePerHour = 0;
	int countWorkingHour=0;
	int totalWorkingHour;
	int day=1;
	int totalDay;
	public void EmpWageBuilder(String company , int wagePerHour , int totalDay, int totalWorkingHour) {
		this.company = company;
		this.totalDay = totalDay;
		this.totalWorkingHour = totalWorkingHour;
		this.wagePerHour = wagePerHour;

		while(countWorkingHour <= totalWorkingHour && day < totalDay) {		      // putting a condition to check for maximum hour and day allowed

			int Random=(int)Math.floor(Math.random()*10) % 3;                    //GENERATING numbers between 0 t0 2 for checking employee type

			switch (Random)                                                   // checking presence with the help of switch statement
			{	
			case FULLTIME:

				fullDayHour = 8;
				break;
			case PART_TIME:

				fullDayHour = 4;
				break;

			default : 

				fullDayHour = 0;
			}             
			monthly_salary+= wagePerHour * fullDayHour ;                                // calculating salary for a month
			countWorkingHour+=fullDayHour;
			day++;

		}
	}
	@Override
	public String toString() {
		return "Calculated Wage [company=" + company + ", monthly_salary=" + monthly_salary + "]";
	}
	


}
