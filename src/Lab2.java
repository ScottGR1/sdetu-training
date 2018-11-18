
public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu1 = new Student("Janelle", "321456456");
		Student stu2 = new Student("Thomas", "123456789");
		Student stu3 = new Student("Elizabeth", "9887654321");
		
		stu1.enroll("Math151");
		stu1.enroll("Math 155");
		stu1.enroll("His211");
		
		//stu1.checkBalance();
		//stu1.showCourse();
		stu1.payTuition(600);
		System.out.println(stu1.toString());
		stu1.setCity("Houston");
		

	}

}

class Student{
	//properties
	private static int id = 1000;
	private String userId;
	private String name;
	private String ssn;
	private String email;
	private String phone;
	private String city;
	private String state;
	private String courses = "";
	private static final int costOfCourse = 800;
	private int balance=0;
	
	//constructor
	public Student(String name, String ssn) {
		id++;
		this.name = name;
		this.ssn = ssn;
		setUserID();
		setEmail();
		
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
		System.out.println(city);
	}

	public String getState() {
		return state;
		
	}

	public void setState(String state) {
		this.state = state;
	}

	
	private void setEmail() {
		email = name + "." + id + "@sdetuniversity.com";
		System.out.println("Your email: " + email);
	}
	
	public String getEmail() {
		return email;
	}

private void setUserID() {
	int max = 9000;
	int min = 1000;
	int randNum = (int)(Math.random()* ((max-min)));
	randNum =  randNum+min;
	userId = id +""+ randNum + ssn.substring(7);
	System.out.println("Your user ID: " + userId);
}

public void enroll(String course) {
	this.courses = this.courses + "\n " + course;
	System.out.println(courses);
	balance = balance + costOfCourse;
}


public void payTuition(int amount) {
	System.out.println("Payment: $ " + amount);
	balance = balance- amount;

}

public void checkBalance() {
	System.out.println("Balance: $ " + balance);
	
	
}

public String toString() {
	return "Name:" + name + "]\n[COURSES:" + courses+ "]\nBALANCE $: " + balance + "]"; 
}

public void showCourse() {
	
}
}
