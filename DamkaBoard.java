/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		if (x <= 0){
			System.out.println(" ");
		}//if
		for (int i = 0; i < x; i++) { //loop for rows

			if (i  % 2 == 1) {// check if we need a space at the beginning of the rows
				System.out.print(" ");
			}
			for (int j = 0; j < x; j++) {//loop for column
                // put the sign *
				if (j < x - 1 ) {
					System.out.print("* ");
				}// if
				else {
					if ( i % 2 == 0){
						System.out.print("* ");
					}//if
					else {
						System.out.print("*");
					}//else

				}// else

			}// second for
			System.out.println(); // move to the next line after each row
		}// first for

	}
}
