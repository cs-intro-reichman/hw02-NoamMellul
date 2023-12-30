import java.util.Random;

/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
        // Range between 1 and 2 include
		int max = 2;
		int min = 1;
		boolean boy = true;
		boolean girl = true;
		String res = "";
		int counter = 0;
		Random rand = new Random();

		while (boy || girl){
			double randomValue = rand.nextDouble();

			        if (randomValue >= 0.5){
					    res = res + "b ";
					    boy = false;
						counter++;
				    }//if
					else {
					    res = res + "g ";
					    girl = false;
					    counter++;
				    }//else
		}//while
		System.out.println(res);
		System.out.println("You made it... and you now have" + " " + counter + " children");
	}
}
