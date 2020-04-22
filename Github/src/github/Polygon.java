package github;

import java.util.Scanner;

public class Polygon {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		System.out.println("The length of the side of a polygon is: ");
		
		double s = Input.nextDouble();
		System.out.println("The area of a polygon is: " + polygonArea(s)+ "\n");
		
	}
	public static double polygonArea(double s) {
		 double n = 7;
		
		return(n*(s*s)/(4*Math.tan(Math.PI/7)));
	}

}
