package com.tnsifDAY3;
import java.util.Scanner;

public class NumberPlay{
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a two-digit number: ");
		int num = scanner.nextInt();
		
		if(num>=10 && num<=99) {
			
		int difference;
		
		
		if(num>50) {
			int digit1 = num / 10;
			int digit2 = num % 10;
			difference = digit1 - digit2;
			
		}else {
			int reversedNum = (num%10)*10 + (num/10);
			int digit1 = reversedNum / 10;
			int digit2 = reversedNum % 10;
			difference = digit1 - digit2;
			
		}
		System.out.println("Difference between digits: "+difference);
		}
		
		else {
			System.out.println("Invalid Number");
		}
		
		scanner.close();		
		
	}
}
