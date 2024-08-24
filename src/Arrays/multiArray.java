package Arrays;
import java.util.*;

public class multiArray {

	public static void main(String[] args) {
		int num, num1;
		int arr [][] = new int[100][100];
		System.out.println("Enter array values : ");
		Scanner input = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = input.nextInt();
				
			}
			
		}
		System.out.println("Entered values are : " + " ");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				
				System.out.print(arr[i][j] + " ");
				
			}
			System.out.println( " ");
		}
		
	}

}
