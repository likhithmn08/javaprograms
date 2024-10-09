package com.dest.basicofprogramming.variables;
import java.util.Scanner;
public class ConditionalStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------if -else-if else---------");
		System.out.println("Enter the agge of the candidate :");
		int age =sc.nextInt();
		if (age<18) {
			System.out.println("child");}
			else if(age>60) {
				System.out.println("senior");
				
			}
			else {
				System.out.println("eligible");
				}
			System.out.println("-----------------------nested if------------");
			int accno=111;
			int pwd=222;
			int acc_new;
			int pwd_new;
			System.out.println("engter the account number=");
			acc_new=sc.nextInt();
			System.out.println("enter the password number=");
			pwd_new=sc.nextInt();
			if(accno==acc_new) {
				if(pwd==pwd_new) {
		    System.out.println("valid customer");
				}
				else {
					System.out.println("Invalid customer");
				}
		}
			else {
				System.out.println("Invalid Acc number");
			}
			
			
			
			System.out.println("--------------switch case---------");
			System.out.println("Enter num-1:");
			int num-1 =sc.nextInt();
			System.out.println("Enter num-2:");
			int num-2=sc.nextInt();
			System.out.println("Enter your choice:\n"
					+"1.Addition\n"
					+"2.Subtraction\n"
					+"3.Multiplication\n"
					+"4.Division\n");
			int choice=sc.nextInt();
			switch(choice)
			{
			case-1:{
					System.out.println("Addition:");
					System.out.println("num1+num2");
					break;
					}
				case-2:{
					System.out.println("Subtraction:");
					System.out.println("num1-num2");
					break;
					}
				case-3:{
					System.out.println("Multiplication:");
					System.out.println("num1*num2");
					break;
					}
				case-4:{
					System.out.println("Division:");
					System.out.println("num1/num2");
					break;
					}
			}
	}}
			
			
			
	
			
			
	
