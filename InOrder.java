import java.util.Random;

/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		Random rand = new Random();
		// we have a range between 0 and 10, and we must take the first number and we shure that -1 will be lower
		int currentNumber = -1;
		int nextNumbber;
		String res = ""; // preparing the result

		do {
			nextNumbber = rand.nextInt(10); // take a number between 0 and 10
			if ( nextNumbber >= currentNumber){ // if the next number is greater or equal than a current number
				res = res + nextNumbber + " "; // we add it to the result
				currentNumber = nextNumbber; // we initialize again
			}
			else {
				break; // if that not the case we stop
			}
		}//do
		while (true); // while that true we continue to run

		System.out.println(res); // printing the result
	}
}
