package constructors;

public class SubConstructor {
	
	int empId;
	String empName;
	int empSal;
	
	SubConstructor(int id, String name, int sal){
		
		empId = id;
		empName = name;
		empSal = sal;
		
				
		
	}
	
	void display() {
		System.out.println(empId + empName + empSal);
	}

}
