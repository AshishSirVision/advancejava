package p1;

//POJO
public class Employee implements java.io.Serializable {
	private int id;
	private String name;
	private int age;
	public Employee() {
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
