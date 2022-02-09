
public class Employee {

	private int empNum;
	private double empSalary;
	
	public Employee(int empNum, double empSalary) {
		super();
		this.empNum = empNum;
		this.empSalary = empSalary;
	}
	
	public Employee() {
		this(1000, 0.0);
	}
	
	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public int getEmpNum() {
		return empNum;
	}

	public double getEmpSalary() {
		return empSalary;
	}
	
	@Override
	public String toString() {
		String str = "Employee number " + empNum + " Employee Salary " + empSalary;
		return str;
	}
	
	
}
