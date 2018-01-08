package com.qtrinh128;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationUser {
	static FileInputStream fis = null;
	static ObjectInputStream ois = null;

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		User user = null;
		fis = new FileInputStream("user.txt");
		ois = new ObjectInputStream(fis);
		user = (User) ois.readObject();
		System.out.println(user.toString());
		if (fis != null) {
			fis.close();
		}
		if (ois != null) {
			ois.close();
		}
	}

}
