import java.util.Random;

/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {

		boolean boy = true;
		boolean girl = true;
		String res = ""; // result
		int counter = 0; // counter to get how many children you have
		Random rand = new Random();// initialize a random number

		while (boy || girl){// while girl or boy are true continue
			double randomValue = rand.nextDouble(); // get a random number between [0;1)

			        if (randomValue >= 0.5){ // if the number is greater or equal to 0.5 you have a boy
					    res = res + "b ";
					    boy = false;
						counter++;
				    }//if
					else { // you have a girl
					    res = res + "g ";
					    girl = false;
					    counter++;
				    }//else
		}//while
		System.out.println(res);
		System.out.println("You made it... and you now have" + " " + counter + " children");
	}
}
