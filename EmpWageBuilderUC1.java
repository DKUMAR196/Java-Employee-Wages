#!/bin/bash -X
public class EmpWagePartTimeUC3 {

	public static void main(String[] args) {
				//Constants
				int isparttime = 1;
				int fulltime = 2;
				int empHrs = 8;
				int empHrsparttime = 4;
				int empRatePerHr = 20;
				int salary = 0;
						
				//Computation
				double empCheck = Math.floor(Math.random() * 10) % 2;
				if (empCheck == fulltime) { }
				
				double empCheck1 = Math.floor(Math.random() * 10) % 2;	
				 if (empCheck1 == isparttime) { 
					
				}
				else {
			    salary = (empHrsparttime * empRatePerHr);
				  System.out.println(salary);
				}
				}
	
	}

