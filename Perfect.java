/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int num = Integer.parseInt(args[0]);
		if (num < 0){
			System.out.println(num + " " + "is not a perfect number");
		}//if
		String res = num + "" +" is a perfect number since " + num + " = 1";
		//String res1 = "";
		int num1 = 1;
		for (int i = 2; i < num - 1 ; i++){
			if (num % i == 0) {
				num1 = num1 + i;
				res = res + " + " + i;
			}//if
		}//for
		if (num1 == num){
			System.out.println(res);
		}//if
		else {
			System.out.println(num +" " + "is not a perfect number");
		}
	}
}
