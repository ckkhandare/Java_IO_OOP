package tester;

import static utils.IO.writeData;
import static utils.IOdummydata.populateData;

import java.util.ArrayList;
import java.util.Scanner;

import base.IOStudent;

public class IOwrite {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			ArrayList<IOStudent> std = new ArrayList<IOStudent>();
			std = populateData();
			System.out.println("Enter File Name : ");
			writeData(sc.next(), std);
			System.out.println("Writing Done...");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
