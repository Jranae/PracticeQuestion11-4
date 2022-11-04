
public class Student {
	private String name;
	private double gpa;
	private int time_spent;
	
	public Student()
	{
		this.name= " ";
		this.gpa=0;
		this.time_spent=0;
	}
	public Student (String name, double gpa, int time_spent) {
		this.name=name;
		this.gpa=gpa;
		this.time_spent=time_spent;
	}
	public String getName() {
		return name;
	}
	public double getGpa() {
		return gpa;
	}
	public int getTimeSpent() {
		return time_spent;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setGpa(double gpa) {
		this.gpa=gpa;
	}
	public void setTimeSpent(int time_spent) {
		this.time_spent=time_spent;
	}
	public String HonorsEligible() {
		String Honors;
		if(gpa>=3.5)
				Honors="true";
		else
			Honors="false";
	return Honors;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Student student1= new Student();
	student1.setName("Peter");
	student1.setGpa(3.8);
	student1.setTimeSpent(3);
	
	System.out.println("Student's honors eligibility check " + student1.HonorsEligible() );
	
	student1.setGpa(3.4);
	System.out.println("Student's honors eligibility check after second year " + student1.HonorsEligible() );
	}

}
