package day3;

public class IncrementOperator {

	public static void main(String[] args) {

			int a = 10;
			
			 ++a;
			System.out.println("The value of ++a: " + a);
			
			System.out.println("The value os a++: " + a);
			
			int b = 20;
			--b;
			System.out.println("The value of --b : " + b);
			System.out.println("The value of b-- : " + b);
			
			int c = 10;
			
			int result = c++; 
			
			System.out.println("The value of c++ : "  + result);
			
			
			System.out.println("The vlaue of C : " + c);
			
			int num1 = 25;
			
			//num1++;
			int result2 = num1--;
			
			System.out.println("The value stored in result2 : " + result2);
			System.out.println("The value of num1: " + num1);

			int num2 = 100;
			
			int result3 = num2--;
			
			System.out.println("The value of result3 : " + result3);
			System.out.println("The value of num2: " + num2);
	}

}
