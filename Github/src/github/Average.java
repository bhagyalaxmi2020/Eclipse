package github;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input number one: ");
		int num1 = in.nextInt();
		
		System.out.println("Input number two: ");	
		int num2 = in.nextInt();
		
		System.out.println("Input number three: ");
		int num3 = in.nextInt();
		
		System.out.println("Input number four: ");
		int num4 = in.nextInt();
		
		System.out.println("Enter fifth number: ");
		int num5 = in.nextInt();
		
		System.out.println("Average of all numbers is: " + (num1 + num2 + num3 + num4 + num5)/5);
				

	}

}
