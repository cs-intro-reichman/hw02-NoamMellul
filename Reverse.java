/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String s = args[0];
		String sOut = "";
		int j = 0;
		for ( int i = s.length() -1; j <= i; i--){
			char c = s.charAt(i);
			sOut = sOut + c;
		}//for

		System.out.println(sOut);

		int middleIndex = s.length() / 2;

		if (s.length() % 2 == 0){
			char middleIndex2 = s.charAt(middleIndex - 1);
			System.out.println("The middle character is" + " " + middleIndex2);
		}//if
		else {
			 System.out.println("The middle character is" + " " + s.charAt(middleIndex));
		}// else
	}
}
