package basicsjava;

class EmployeeDetails{
	
	String name , address ;
	int yoj;
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public String getAddress(){
		return address;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public int getYOJ(){
		return yoj;
	}
	public void setYOJ(int yoj){
		this.yoj = yoj;
	}
	
	public String toString(){
		return "Name : "+name+" Year of joining : "+yoj+" Address : "+address;
	}
	
}


public class Employee {

	public static void main(String[] args) {
		EmployeeDetails emp1 = new EmployeeDetails();
		emp1.setName("Robert");
		emp1.setYOJ(1994);
		emp1.setAddress("64C-WallsStreet");
		
		EmployeeDetails emp2 = new EmployeeDetails();
		emp2.setName("Sam");
		emp2.setYOJ(2000);
		emp2.setAddress("68D-WallsStreet");
		
		EmployeeDetails emp3 = new EmployeeDetails();
		emp3.setName("John");
		emp3.setYOJ(1999);
		emp3.setAddress("26B-WallsStreet");
		
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);

	}

}
