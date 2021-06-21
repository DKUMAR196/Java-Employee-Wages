#!/bin/bash -X

public class EmpWageDailyUC2 {

	public static void main(String[] args) {
				//Constants
				int IS_PRESENT = 1;
				int empHrs = 8;
				int empRatePerHr = 20;
				int salary = 0;
						
				//Computation
				double empCheck = Math.floor(Math.random() * 10) % 2;
				if (empCheck == IS_PRESENT) {  
					
						salary = (empHrs * empRatePerHr);
						System.out.println(salary);
				}
						else {
							salary = 0;	
						}
				}
	}

