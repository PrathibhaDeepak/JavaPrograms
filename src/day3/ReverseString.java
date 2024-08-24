package day3;

public class ReverseString {

	public static void main(String[] args) {

		String input = "Operator";
		String output = " ";
		
		for(int i=input.length()-1; i>=0; i--) {
			
			output = output + input.charAt(i);
			
		}
		System.out.println("String input is :" + input);
		System.out.println("Reversed string is : " + output);
	}

}
