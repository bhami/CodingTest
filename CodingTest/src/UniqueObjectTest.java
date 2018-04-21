import java.util.HashSet;
import java.util.Set;

class Employee{
	private int id;
	private String firstName;
	private String lastName;
	private String address;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Employee(int id, String firstName, String lastName, String address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	public Employee() {
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ "]";
	}
	
	
}
public class UniqueObjectTest {

	public static void main(String[] args) {
		
	Set<Employee> employees = new HashSet<Employee>(0);	
	employees.add(new Employee(1,"Bhami","Jain","NJ"));
	employees.add(new Employee(2,"Sami","Jain","NJ"));
	employees.add(new Employee(3,"Bhanu","Jain","NJ"));	
	employees.add(new Employee(4,"Sanu","Jain","NJ"));	
	employees.add(new Employee(4,"Sanu","Jain1","NJ"));	
	employees.add(new Employee(4,"Sanu","Jain","NJ"));	
	System.out.println("No. of recoreds : " + employees.size());
	System.out.println(employees);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
