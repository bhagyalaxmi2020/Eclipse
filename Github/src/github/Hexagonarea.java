package github;

import java.util.Scanner;

public class Hexagonarea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("The length of the side of a Hexagon is: ");
		
		double s = input.nextDouble();
		
		System.out.print("The area of Hexagon is: " + hexagonArea(s) + "\n");
	}
	public static double hexagonArea(double s) {
			return(6*(s*s))/(4*Math.tan(Math.PI/6));
		}
		
		

	}

	


