package day_seventeen0807;

public class Employee {

	private int Id;
	private String name;
	private float salary;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		if(id > 0) {
			this.Id = id;
		}
		else {
			System.out.println("Invalid Id");
			setId(id);
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
}
