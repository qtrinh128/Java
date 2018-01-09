package com.qtrinh129;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationPerson {
	static FileOutputStream fos = null;
	static ObjectOutputStream oos = null;

	public static void main(String[] args) throws Exception {
		Person person = new Person("Thao", "Thai Nguyen");
		fos = new FileOutputStream("person.txt");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(person);
		if(fos != null) {
			fos.close();
		}
		if(oos != null) {
			oos.close();
		}
	}

}
