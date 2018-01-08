package com.qtrinh128;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeUser {
	static FileOutputStream fos = null;
	static ObjectOutputStream oos = null;
	public static void main(String[] args) throws IOException {
		User user = new User("Trinh", 23, "Ha Noi", true);
		fos = new FileOutputStream("user.txt");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(user);
		System.out.println("Success!!");
		oos.flush();
		if(fos != null) {
			fos.close();
		}
		if(oos != null) {
			oos.close();
		}
	}

}
