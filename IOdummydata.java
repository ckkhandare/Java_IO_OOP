package utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

import static base.IOSubject.*;
import base.IOStudent;

public interface IOdummydata {

	public static ArrayList<IOStudent> populateData() {
		ArrayList<IOStudent> list = new ArrayList<>();
		list.add(new IOStudent("012", "chandrakant", LocalDate.parse("1996-07-03"), JAVA, 8.7));
		list.add(new IOStudent("2", "romi", LocalDate.parse("1996-06-08"), CLOUD, 7.8));
		list.add(new IOStudent("3", "rani", LocalDate.parse("1995-01-09"), ML, 5.8));
		list.add(new IOStudent("4", "ravi", LocalDate.parse("1996-05-05"), R, 6.5));
		list.add(new IOStudent("5", "srushti", LocalDate.parse("1999-05-05"), JAVA, 7.8));
		list.add(new IOStudent("6", "tejas", LocalDate.parse("1998-05-05"), R, 3.5));

		Collections.sort(list, (o1, o2) -> ((Double) o1.getGpa()).compareTo(o2.getGpa()));
		return list;
	}
}
