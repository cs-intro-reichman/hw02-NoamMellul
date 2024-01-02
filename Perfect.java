/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int num = Integer.parseInt(args[0]);
		if (num < 0){ // if num is not a positive number
			System.out.println(num + " " + "is not a perfect number");
		}//if
		String res = num + "" +" is a perfect number since " + num + " = 1"; // the result

		int num1 = 1;// initialize of num1
		for (int i = 2; i < num - 1 ; i++){//loop for to check if num is divisible by i
			if (num % i == 0) {
				num1 = num1 + i;// addition the index we find to the num1 to know if num is a perfect number
				res = res + " + " + i;//add i to the result
			}//if
		}//for
		if (num1 == num){ // if num1 equal to num he is a perfect number
			System.out.println(res);
		}//if
		else { // he's not a perfect number
			System.out.println(num +" " + "is not a perfect number");
		}
	}
}
