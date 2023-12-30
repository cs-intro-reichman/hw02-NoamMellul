import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  
		
		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the 
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.

		double totalChild = 0;
		int fam2 = 0;
		int fam3 = 0;
		int fam4OrMore = 0;

		for (int i = 0; i < T ; i++) {
			int counter = 0;
			boolean boy = true;
			boolean girl = true;
			//int rand = (int) ((Math.random()) *2+1);
			//double rnd = generator.nextDouble();

			while (boy || girl) {
				double rnd = generator.nextDouble();
				if (rnd <= 0.5) {
					boy = false;
					counter++;
				}//if
				else {
					girl = false;
					counter++;
				}//else
				//rand = (int) ((Math.random()) *2+1);
				//rnd = generator.nextDouble();

			}//while


			if (counter == 2){
				fam2 += 1;
			}

			else if (counter == 3){
				fam3 += 1;
			}

			else {
				fam4OrMore += 1;
			}
			totalChild += counter;

		}//for

		//System.out.println(totalChild);

		double average = totalChild / T;
		System.out.println("Average: " + average + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + fam2);
		System.out.println("Number of families with 3 children: " + fam3);
		System.out.println("Number of families with 4 or more children: " + fam4OrMore);

		if ( fam2 > fam3 && fam2 > fam4OrMore){
			System.out.println("The most common number of children is 2.");
		}

		if ( fam3 > fam2 && fam3 > fam4OrMore){
			System.out.println("The most common number of children is 3.");
		}

		if ( fam4OrMore > fam3 && fam4OrMore > fam2){
			System.out.println("The most common number of children is 4 or more.");
		}
		    
	}
}
