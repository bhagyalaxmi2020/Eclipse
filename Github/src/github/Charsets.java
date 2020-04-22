package github;
import java.nio.charset.*;

public class Charsets {

	public static void main(String[] args) {
		System.out.println("The available character sets are: ");
		for (String str: Charset.availableCharsets().keySet()) {
			System.out.println(str);
		}

	}

}
