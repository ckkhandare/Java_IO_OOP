package base;

import java.time.LocalDate;

public class IOStudent {

	private String rollNo, name;
	private LocalDate dob;
	private IOSubject subject;
	private double gpa;

	public IOStudent(String rollNo, String name, LocalDate dob, IOSubject subject, double gpa) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.dob = dob;
		this.subject = subject;
		this.gpa = gpa;
	}



	public String getName() {
		return name;
	}



	public double getGpa() {
		return gpa;
	}



	@Override
	public String toString() {
		return "" + rollNo + " " + name + " " + dob + " " + subject + " " + gpa + " ";

	}

}
