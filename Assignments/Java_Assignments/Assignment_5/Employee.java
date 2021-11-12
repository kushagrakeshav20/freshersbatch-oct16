import java.util.*;
  class Details{
	private int id;
	private String name;
	private int salary;
	private String department;
	
	public Details(int id, String name, int salary, String department) {
		this.id = id;
		this.name=name;
		this.salary = salary;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	public String displayDetails() {
		return "GenericEmployee{" +"id=" + id +", name='" + name + '\'' +", salary='" + salary + '\'' + ", department='" + department + '\'' +'}';
			
	};
}
	

public class Employee {
	public static void main(String args[]) {
		HashSet<Details> employee = new HashSet<>();
		
		employee.add(new Details(1,"Kushagra",25000,"IT"));
		employee.add(new Details(2,"Keshav",25000,"IT"));
		employee.add(new Details(3,"SK",27000,"CS"));
		employee.add(new Details(5,"Chetan",29000,"Sales"));
		
		for(Details D : employee) {
			System.out.println(D.displayDetails());
		}
		
	}

}
