package eTradeSystem.core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
   public static boolean match(String email) {
	   String regex = "^[a-zA-Z0-9_!-+%-._]+@[a-zA-Z0-9-]+.[a-z]+$";
	   Pattern pattern = Pattern.compile(regex);
	   Matcher matcher = pattern.matcher(email);
	   
	   if (!matcher.matches()) {
		System.out.println(email+" email adresi,RegEx doðrulamasýndan geçemedi.");
	   } 
	   return matcher.matches();
}
}
