package github;

public class Rectangle {
private static final double Width = 5.6;
private static final double Height = 8.5;


	public static void main(String[] args) {
		
		double perimeter  = 2 * (Width + Height);
		double area = (Width * Height);
		
		System.out.println("Perimeter of a Rectangle is: " + perimeter);
		System.out.println("area of a Rectangle is: " + area);

	}

}
