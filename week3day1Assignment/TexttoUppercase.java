package week3day1Assignment;
/*
Pseudo Code

* Declare String Input as Follow
 
* String test = "changeme";

* a) Convert the String to character array

* b) Traverse through each character (using loop)

* c)find the odd index within the loop (use mod operator)

* d)within the loop, change the character to uppercase, if the index is odd else don't change
 
*/
public class TexttoUppercase {

	public static void main(String[] args) {
		String test="changeme";
		char[] charArray = test.toCharArray();
			for (int i = 0; i < charArray.length; i++) {
				charArray[i]= Character.toUpperCase(charArray[i]);
					}
			System.out.println(charArray);
	}

}
