package p1;

public class EmployeeMain {
	public static void main(String args[]) {
		Employee e = new Employee();// object is created  //usebean
		e.setId(111);//setproperty
		e.setName("Arjun");// setting value to the object
		System.out.println(e.getName());
		System.out.println(e.getId());//getproperty
	}
}
