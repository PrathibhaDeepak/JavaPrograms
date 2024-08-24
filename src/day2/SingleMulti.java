package day2;

public class SingleMulti {

	public static void main(String[] args) {
		
		int one = 10;
		int two = 20;
		
		int c = one;
		one = two;
		two = c;
		
		System.out.println("Value of One : " + one);
		System.out.println("Value of Two : " + two);
		
		int arr [][] = { {100,200, 333}, {300, 400,222}, {500,600,444}, {700,800,555}};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);
				
				System.out.print(" " );
			}
			System.out.println(" ");
		}

	}

}
