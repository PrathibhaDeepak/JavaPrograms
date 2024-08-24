package Arrays;
import java.util.*;

public class ArraySum {

	public static void main(String[] args) {
		
		int arr [] = new int[5];
		int sum = 0;

		System.out.println("Enter values: ");
		Scanner input = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			arr[i] = input.nextInt();
			
		}
		System.out.println(" Entered values are: ");
		for(int i=0; i<5; i++) {
			System.out.print("\t" + arr[i]);
			sum = sum+ arr[i];
			
			
		}
		
		System.out.println(" \n Sum is : " + sum);
			
				
		
	}

}
