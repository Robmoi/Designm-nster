
public class Testing {
	public static void main(String[] args) {

	Employee emp = new Employee("Sven", "Dep", new Role("Manager"));
	System.out.println(emp);
	emp.addRole(new Role("Engineer"));
    System.out.println(emp);
    }
}
