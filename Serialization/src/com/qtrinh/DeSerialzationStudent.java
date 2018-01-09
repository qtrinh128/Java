package com.qtrinh;
/* Việc đọc các đối tượng được ghi xuống file mà ta không biết thứ tự được ghi của chúng sẽ sinh ra ngoại lệ
 * Đây là demo xử lý chúng 
 * */
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialzationStudent {

	static FileInputStream fis = null;
	static ObjectInputStream ois = null;

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Object object = null;
		Student1 st1 = null;
		Student2 st2 = null;
		Student3 st3 = null;

		fis = new FileInputStream("Student.txt");
		ois = new ObjectInputStream(fis);
		try {
		while ((object = ois.readObject()) != null) {
			if (object instanceof Student1) {
				st1 = (Student1) object;
			} else if (object instanceof Student2) {
				st2 = (Student2) object;
			} else if (object instanceof Student3) {
				st3 = (Student3) object;
			}
		}}catch(EOFException eof) {
			System.out.println("Done !!!");
		}
		System.out.println(st1.toString());
		System.out.println(st2.toString());
		System.out.println(st3.toString());
		if (fis != null) {
			fis.close();
		}
		if (ois != null) {
			ois.close();
		}
	}

}
