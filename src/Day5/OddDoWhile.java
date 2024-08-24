package Day5;

public class OddDoWhile {

	public static void main(String[] args) {
		
		int num = 10;
		
		do {
			if(num%2==1) {
				System.out.println("Odd : " + num);
				
			}
			num--;
		}
		while(num>=1);

	}

}
