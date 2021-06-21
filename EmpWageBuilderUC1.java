#!/bin/bash -x
public class SwitchCaseStatement {

	public static void main(String[] args) {
				//Constants
				int isparttime = 1;
				int fulltime = 2;
				int empRatePerHrs =20;
				int salary = 0;
				int empHrs =4;
				//Computation
				switch(salary) {
				case'A':
				double empCheck = Math.floor(Math.random() * 10) % 3;
				
				       if (empCheck == fulltime)
					              
					break;
				case 'B' :
			    double empCheck1 = Math.floor(Math.random() * 10) % 3;
				
					   if (empCheck1 == isparttime)
						         
					break;
					
				case 'C':		
				double empCheck2 = Math.floor(Math.random() * 10) % 3;
				
						   if (empCheck2 == isparttime)
							         
					break;
					
				default:
					
					salary = (empHrs * empRatePerHrs);
					System.out.println(salary);
						
					}		
	}
}

