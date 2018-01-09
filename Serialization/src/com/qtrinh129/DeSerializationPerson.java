package com.qtrinh129;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializationPerson {
	static FileInputStream  fis= null;
	static ObjectInputStream ois = null;
	public static void main(String[] args) throws Exception{
		Person person = null;
		fis = new FileInputStream("person.txt");
		ois = new ObjectInputStream(fis);
		person = (Person) ois.readObject();
		System.out.println(person.name);
		System.out.println(person.age);
		System.out.println(person.address);
		if(fis != null) {
			fis.close();
		}
		if(ois != null) {
			ois.close();
		}
	}
}
