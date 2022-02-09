
public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Class [] arrayName = new Class[size of Array that you wanna create]
		Employee[] emps = new Employee[4];
		//emps[0] = new Employee(1001, 5000.0);
		
		for(int i = 0; i < emps.length; i++) {
			emps[i] = new Employee(1000 + i, 5000.0);
		}
		
		int [] numbers = {3,5,6,8,9,0};
		int [] numbers2 = numbers;
		
		numbers[2] = 56;
		
		for(int num:numbers) {
			System.out.print(num + "\s");
		}
		
		System.out.println();
		
		for(int num:numbers2) {
			System.out.print(num + "\s");
		}
		
		
		System.out.println();
		
		
		/*for (Employee emp:emps) {
			//use toString method to call the method
			System.out.println(emp);
			//System.out.println(emp.toString());
			//unable to use toString as there are values is null
		}
		*/
		
		Employee [] emps2  = {new Employee(), new Employee(2000,6000.5), new Employee(), new Employee(3000, 8000.5)};
		for (Employee emp:emps2) {
			//use toString method to call the method
			// emp is the object of the array
			System.out.println(emp);
			//System.out.println(emp.toString());
		}

	}

}
