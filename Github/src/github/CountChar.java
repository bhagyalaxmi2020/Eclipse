package github;

public class CountChar {

	public static void main(String[] args) {
		String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		
		Count(test);
		
	}
	public static void Count(String x) {
	char[] ch = x.toCharArray();
	int letter = 0;
	int space = 0;
	int num = 0;
	int other = 0;
	for (int i=0; i < x.length(); i++) {
	 
		if(Character.isLetter(ch[i])) {
			letter++;
			
		}else if(Character.isSpaceChar(ch[i])) {
			space++;
		} else if(Character.isDigit(ch[i])) {
			  num++;
			  	 
		 }else   { 
		           other++;
		
		 }
			
	}
	System.out.println("The string is :Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
	

	System.out.println("letter: " + letter);
	System.out.println("Space: " + space);
	System.out.println("Digit: " + num);
	System.out.println("Other: " + other);
	
	} 
}
	
	
	
		
		
		
		
		

	


