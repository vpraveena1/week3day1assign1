package week3day1Assignment;
/*
 * Pseudo code 
 
 * a) Use the declared String text as input
	String text = "We learn java basics as part of java sessions in java week1";		
 * b) Initialize an integer variable as count	  
 * c) Split the String into array and iterate over it 
 * d) Initialize another loop to check whether the word is there in the array
 * e) if it is available then increase and count by 1. 
 * f) if the count > 1 then replace the word as "" 
 
 * g) Displaying the String without duplicate words	
 */
public class RemoveDuplicate {

	public static void main(String[] args) {
		String text="We learn java basics as part of java sessions in java week1";
		int count=0;
		String[] split = text.split(" ");
		for (int i = 0; i < split.length; i++) {
			if(split[i].startsWith("java"))
			{
				count=count+1;
				//System.out.println(split[i]);
			}
					}
			if(count>1)
		{
				String replace = text.replace("java", "");
			System.out.println("The text without duplicate data: "+replace);
		}
		else {
			System.out.println("We learn java basics as part of java sessions in java week1");
		}
	}

}
