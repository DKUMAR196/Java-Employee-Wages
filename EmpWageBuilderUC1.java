#!/bin/bash -x
public class EmpWage_A_Month {

	public static void main(String[] args) {
		//Constants
		int isparttime = 1;
		int fulltime = 2;
		int empHrs = 160;
		int empHarPerDay = 8;
		int empRatePerHr = 20;
		int salary = 0;
				
		//Computation
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == fulltime) {
			
		}
		
		double empCheck1 = Math.floor(Math.random() * 10) % 2;	
		 if (empCheck1 == isparttime) { 
			
		}
		else {
	    salary = (empHrs * empRatePerHr);
	    System.out.println("Wages\r\n"
	    		+ "for a Month\r\n"
	    		+ "- Assume 20 Working Day per Month " );
		  System.out.println(salary);
		}
		}

}

