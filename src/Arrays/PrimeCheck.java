package Arrays;
import java.util.*;

public class PrimeCheck {

	public static void main(String[] args) {
		int count = 0;
		int num;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = input.nextInt();
		
		
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				count++;
			}
					
		}
		if(count==2) {
			System.out.println(num + "  is Prime number"  );
		}
		else {
			System.out.println(num + " is not Prime number");
		}
			
	}

}
