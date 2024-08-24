package Arrays;
import java.util.*;

public class BrotoTypeArray {

	public static void main(String[] args) {

		
		int arr [] = new int[5];
		System.out.println("Enter values: ");
		
		Scanner input = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			arr[i] = input.nextInt();

		}
			System.out.println("Entered values are:");
		for(int i=0; i<5; i++) {
		//System.out.println( arr[i]);
			System.out.print("\t" + arr[i]);
	}
	}

}
