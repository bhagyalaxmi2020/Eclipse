package github;

import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Input first integer; ");
		int num1 = in.nextInt();
		
		System.out.println("Input second integer; ");
		int num2 = in.nextInt();
		
		if (num1 == num2) 
			System.out.printf("%d == %d" , num1, num2 );
		if (num1 != num2)	
			System.out.printf("%d != %d\n" , num1, num2 );
		if (num1 <= num2)
			System.out.printf("%d <= %d\n" , num1, num2 );
		if (num1 >= num2)
			System.out.printf("%d >= %d\n" , num1, num2 );
		if (num1 == num2)
			System.out.printf("%d == %d\n" , num1, num2 );
		if (num1 > num2)
			System.out.printf("%d > %d\n" , num1, num2 );
		if (num1 < num2)
			System.out.printf("%d < %d\n" , num1, num2 );
			
		}		
		
		
	}


