package week3day1Assignment;
/*
 * Pseudo Code

 * a) Declare A String value as"madam"
 
 * b) Declare another String rev value as ""
 * c) Iterate over the String in reverse order
 * d) Add the char into rev
 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
 
 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
 */

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		String str1="praveena";
		String rev= "";
	char[] charArray = str1.toCharArray();
	char[] charArray2 = rev.toCharArray();
		for (int i = charArray.length-1; i >=0; i--) {
			rev=rev+charArray[i];
			System.out.print(charArray[i]);
		}
		
		if(Arrays.equals(charArray, charArray2))
		{
		System.out.println("It is a palindrome "+rev );
	}
		else {
			System.out.println("It is not palindrome "+rev);
		}
}
}