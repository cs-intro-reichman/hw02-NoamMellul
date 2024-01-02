/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		//// Put your code here
		int x = Integer.parseInt(args[0]);
		if (x == 0){ // x is not divisible
			System.out.println("Null");
		}
		    for (int i = 1; i <= x ; i++){ // loop for to check if x is divisible by i
			     if ( x%i == 0){ // if x divisible by i without rest
				     System.out.println(i); // print i
			     }
		    }
	}
}
