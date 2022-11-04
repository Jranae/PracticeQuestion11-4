
public class EmployeePractice {

	private String firstName;
	private String lastName;
	private String position;
	private double salary;
	private double hoursWorked;
	
	public EmployeePractice()
	{
		this.firstName= " ";
		this.lastName= " ";
		this.position= " ";
		this.salary= 8.25;
		this.hoursWorked=0;
	}
	public EmployeePractice(String firstName, String lastName, String position, double salary,
			double hoursWorked)
	{
		this.firstName= firstName;
		this.lastName= lastName;
		this.position= position;
		this.salary= salary;
		this.hoursWorked=hoursWorked;
	}
	public String getfirstName() {
	return firstName;
}
	public String getlastName() {
	return lastName;
	}
	public String getposition() {
	return position;
	}
	public double getsalary() {
	return salary;
	}
	public double gethoursWorked() {
	return hoursWorked;
	}
	public void setfirstName(String firstName) {
		this.firstName=firstName;
	}
	public void setlastName(String lastName) {
		this.lastName=lastName;
	}
	public void setposition(String position) {
		this.position=position;
	}
	public void setsalary(double salary) {
		this.salary=salary;
	}
	public void sethoursWorked(double hoursWorked) {
		this.hoursWorked=hoursWorked;
	}
	public double showCurrentPay() {
		double pay =0.0;
		if (hoursWorked<=40){
			pay=hoursWorked*salary;
		}
		else
		{
		double overtime= hoursWorked-40.0;
		pay=(40*salary)+(overtime*salary*1.5);
		}
		return pay; 
	}
	public String DisplayPayCheck() {
	StringBuilder sb= new StringBuilder();
	sb.append("=====" + firstName.toUpperCase() + "" + lastName.toUpperCase() + "=====\n");
	sb.append("Hours Worked : " + hoursWorked + "\n");
	sb.append("Position : " + position + "\n");
	sb.append("Salary" + salary + "\n");
	sb.append("Total Pay: " + this.showCurrentPay() + "\n");
	
	return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeePractice person1 = new EmployeePractice("John", "Doe", "The Boss", 20.00, 30);
		System.out.println(person1.DisplayPayCheck());
		
		EmployeePractice person2 = new EmployeePractice("Harry", "Potter", "The Boss", 20.00, 30);
		System.out.println(person2.DisplayPayCheck());
	}

}
