import java.util.Random;

/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		double totalChild = 0;
		int fam2 = 0;
		int fam3 = 0;
		int fam4OrMore = 0;

        for (int i = 0; i < T ; i++) { // loop for to simulate the number of families
			int counter = 0; // to get how many children
			boolean boy = true;
			boolean girl = true;
			int rand = (int) ((Math.random()) *2+1); // random number between [1;2]

			while (boy || girl) { // while girl or boy are true continue
				if (rand == 1) { // get a boy
					boy = false;
					counter++;
				}//if
				else {//get a girl
					girl = false;
					counter++;
				}//else
				rand = (int) ((Math.random()) *2+1);// get a new number

			}//while


            if (counter == 2){ // if the counter is 2 add to the fam2
				fam2 += 1;
			}

			else if (counter == 3){// if the counter is 3 add to the fam3
				fam3 += 1;
			}

			else {// if the counter is 4 or more add to the fam4OrMore
				fam4OrMore += 1;
			}
			totalChild += counter; // add the counter to the total that we simulated

		}//for



		double average = totalChild / T; // average
		System.out.println("Average: " + average + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + fam2);
		System.out.println("Number of families with 3 children: " + fam3);
		System.out.println("Number of families with 4 or more children: " + fam4OrMore);

		// we need to know who is the common number of children
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
