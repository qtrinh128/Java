package com.qtrinh1289;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {
	static FileInputStream fis = null;
	static ObjectInputStream ois = null;
	public static void main(String[] args) throws Exception {
		SalaryEmployee salaryEmployee = null;
		try {
			fis = new FileInputStream("inforEmployee.txt");
			ois = new ObjectInputStream(fis);
			salaryEmployee = (SalaryEmployee)ois.readObject();
			System.out.println(salaryEmployee.toString());
		} catch (Exception e) {
			if(fis != null) {
				fis.close();
			}
			if(ois != null) {
				ois.close();
			}
			e.printStackTrace();
		}
	}

}
