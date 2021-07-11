 package tester;

import static utils.IO.readData;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import base.IOStudent;
import base.IOSubject;

public class IOread {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			ArrayList<IOStudent> students = new ArrayList<IOStudent>();
			System.out.println("Enter File Name to read data : ");
			students = readData(sc.next());
			students.forEach(System.out::println);
			System.out.println("Enter new Student information :");
			System.out.println("rollNo,name,dob(yyyy-MM-dd),subject,gpa");
			students.add(new IOStudent(sc.next(), sc.next(), LocalDate.parse(sc.next()),
					IOSubject.valueOf(sc.next().toUpperCase()), sc.nextDouble()));
			System.out.println("new Student Added ");
			System.out.println("Overall Topper : "
					+ students.stream().max((o1, o2) -> ((Double) o1.getGpa()).compareTo(o2.getGpa())).get().getName());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
