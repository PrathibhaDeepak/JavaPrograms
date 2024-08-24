package Arrays;

public class SingleAndMultiArrays {

	public static void main(String[] args) {
		
		int r, c;
		
		int arr [][] = {{100,200},
				        {300,400}, 
				        {500,600}};
		
		System.out.println("Length of Row is : " + arr.length);
		System.out.println("Length of Column is : " + arr[0].length);
		
		for( r=0; r<=arr.length; r++) {
			for( c=0; c<arr[r].length; c++){
			{
				System.out.print(arr[r][c]);
				System.out.print(" ");
			}
		
		}
		
			

		}
	}}

