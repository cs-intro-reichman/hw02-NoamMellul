/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String s = args[0];//get a string
		String sOut = "";// the string we get after the reverse
		int j = 0;
		for ( int i = s.length() -1; j <= i; i--){ // loop for to run between the length-1 of the string to 0
			char c = s.charAt(i);//we exchange places starting with the last letter
			sOut = sOut + c;//the result
		}//for

		System.out.println(sOut);

		int middleIndex = s.length() / 2; // middle char of the string

		if (s.length() % 2 == 0){ // if the number of letter is even
			char middleIndex2 = s.charAt(middleIndex - 1); // get the char at the middle index -1
			System.out.println("The middle character is" + " " + middleIndex2);
		}//if
		else {// if the number of letter is odd
			 System.out.println("The middle character is" + " " + s.charAt(middleIndex));
		}// else
	}
}
