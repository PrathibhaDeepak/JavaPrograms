package Prime;

public class PrimeNumber {

	public static void main(String[] args) {

		int num = 7, count = 0; 
		
		
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				 count++;
			}
				
		}
		if(count ==2) {
			System.out.println("Entered number "  +  num +  " is a Prime number");
		}
		else {
			System.out.println("Entered number %d is Not Prime number " + num);
		}
	}

}
