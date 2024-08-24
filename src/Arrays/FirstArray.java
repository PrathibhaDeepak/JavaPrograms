package Arrays;

import java.util.*;

public class FirstArray {

	public static void main(String[] args) {

		/* //int arr []  = new int [10];
		
		int arr [] = {100,200,300,400,500, 600};
		int len = arr.length;
		
		System.out.println("Total length of Array \n"  + len);
		System.out.println("Array Values are \n " + Arrays.toString(arr));
	}
	*/
		int arr[][] = {{100,200},{300,400},{500,600}};
					
		for(int row[]: arr) {
			for(int col: row) {
				System.out.print(col+ " ");
				
			}
			System.out.println();
		}
	}
	

}
