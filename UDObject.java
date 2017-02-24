import java.util.ArrayList;

class UDObject {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		Employee ram = new Employee("Ram", 32, 25000);
		Employee john = new Employee("John", 25, 15000);
		list.add(ram);
		list.add(john);
		
		for(Employee e : list) {
			System.out.println(e.toString());
		}
	}

}
