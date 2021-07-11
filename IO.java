package utils;

import static java.time.LocalDate.parse;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import base.IOStudent;
import base.IOSubject;

public interface IO {

	public static void writeData(String filename, ArrayList<IOStudent> al) {
		try (PrintWriter pw = new PrintWriter(new FileWriter(filename))) {
			for (IOStudent student : al) {

				pw.println(student.toString());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static ArrayList<IOStudent> readData(String filename) {
		ArrayList<IOStudent> al = new ArrayList<IOStudent>();
		try (BufferedReader br = new BufferedReader(new FileReader(filename));) {
			String line = null;

			while ((line = br.readLine()) != null) {
				Scanner sc = new Scanner(line);
				IOStudent s = new IOStudent(sc.next(), sc.next(), parse(sc.next()), IOSubject.valueOf(sc.next()),
						Double.parseDouble(sc.next()));
				al.add(s);
				sc.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return al;
	}
}
