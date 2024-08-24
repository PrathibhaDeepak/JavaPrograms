package Day4;
import java.util.*;

public class LargestNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter 3 values: ");
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		/* (num1 < num2)
		(num3 > num1)
		(num3 < num1)
		(num2 > num3)
		(num2 < num3)
				 */
		
		if((num1 > num2) && (num1> num3)){
			System.out.println(num1 + " is the greatest number");
		}
		else if((num2 > num3)&& (num2 > num1)){
			System.out.println(num2 + " is the greatest number");
		}
		else if((num3 > num1) && (num3 > num2)) {
			System.out.println( num3 + " is the greatest number");
		}
		else {
			System.out.println("Entered numbers are same");
		}
	}
	
}
