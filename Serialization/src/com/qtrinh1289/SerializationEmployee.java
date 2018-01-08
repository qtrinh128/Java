package com.qtrinh1289;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEmployee {
	static FileOutputStream fos = null;
	static ObjectOutputStream oos = null;

	public static void main(String[] args) {
		SalaryEmployee salaryEmployee = new SalaryEmployee("001", "Trinh", 23, true, "Nhan vien", 100.10f, 25.25f);
		try {
			fos = new FileOutputStream("inforEmployee.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(salaryEmployee);
			System.out.println("Success!!!");
		} catch (FileNotFoundException e) {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			e.printStackTrace();
		} catch (IOException e) {
			if(oos != null) {
				try {
					oos.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			e.printStackTrace();
		}
	}

}
