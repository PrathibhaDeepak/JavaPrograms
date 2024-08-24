package PostPreIncrement;

public class PostIncrement {

	public static void main(String[] args) {
		
		int a = 10;
		
		
		System.out.println(a);
		
		
		System.out.println("Value of a: " + a);
		int res = a++;
		
		System.out.println("Value of res : " + res);
		
		int b = 20;
		System.out.println("value of b : " + b);
		//int res1 = b--;
		int res2 = --b;
		//System.out.println("Value of res1 : " + res1);
		
		System.out.println("Value of res2 : " + res2);
	}

}
