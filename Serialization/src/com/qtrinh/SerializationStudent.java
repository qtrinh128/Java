package com.qtrinh;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
/*Ghi 3 class xuống file
 * */
public class SerializationStudent {
	static FileOutputStream fos = null;
	static ObjectOutputStream oos = null;

	public static void main(String[] args) throws IOException {
		Student1 st1 = new Student1("studen 1", 22);
		Student2 st2 = new Student2("studen 2", 23);
		Student3 st3 = new Student3("student 3", 24);
		fos = new FileOutputStream("Student.txt");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(st1);
		oos.writeObject(st2);
		oos.writeObject(st3);
		System.out.println("Success!!");
		oos.flush();
		if (fos != null) {
			fos.close();
		}
		if (oos != null) {
			oos.close();
		}
	}
}
