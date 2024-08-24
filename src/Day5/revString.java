package Day5;

public class revString {

	public static void main(String[] args) {


		String Rev = "Levis";
		String Output = " ";
		
		int len = Rev.length();
		
		System.out.println(" Length of the string Rev : " + len);
		
		for(int i=len-1; i>=0; i--){
			Output = Output + Rev.charAt(i);
			System.out.println(Output);
		}
		System.out.println("Reverse of Levis: " + Output);

	}

}
