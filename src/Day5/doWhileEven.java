package Day5;

public class doWhileEven {

	public static void main(String[] args) {
		
		int num = 0;
		
		do {
			if(num%2 == 0)
			{
				System.out.println("Even " + num);
				
			}
			num++;
		
		}
		while(num<+10);

}
}