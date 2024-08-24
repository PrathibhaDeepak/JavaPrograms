package Day4;
import java.util.*;
public class SwitchCase {

	public static void main(String[] args) {
		
		
		System.out.println("Enter your Grade: ");
		Scanner input = new Scanner(System.in);
		String Grade = input.nextLine();
		
		switch(Grade){
		
		case "A" : System.out.println("Distinction"); break;
		
		case "B" : System.out.println("First Class"); break;
		
		case "C" : System.out.println("Second Class"); break;

		case "D" : System.out.println("Very good"); break;
				
		case "E" : System.out.println("Need to improve"); break;
		
		default: System.out.println("Invalid entry");


	
		
	}

}
	}
