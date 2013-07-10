package item03.serializable;

import item03.SingletonFinalField;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Testing {
	
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("obj");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(SingletonFinalField.INSTANCE);
		
		oos.close();

		FileInputStream fis = new FileInputStream("obj");
		ObjectInputStream ois = new ObjectInputStream(fis);
		SingletonFinalField obj1 = (SingletonFinalField) ois.readObject();
		
		ois.close();

		fis = new FileInputStream("obj");
		ois = new ObjectInputStream(fis);
		SingletonFinalField obj2 = (SingletonFinalField) ois.readObject();
	
		System.out.println(obj1 == obj2);
		
		ois.close();
		
		fos = new FileOutputStream("obj");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(SingletonFinalFieldFix.INSTANCE);
		
		oos.close();

		fis = new FileInputStream("obj");
		ois = new ObjectInputStream(fis);
		SingletonFinalFieldFix obj3 = (SingletonFinalFieldFix) ois.readObject();
		
		ois.close();

		fis = new FileInputStream("obj");
		ois = new ObjectInputStream(fis);
		SingletonFinalFieldFix obj4 = (SingletonFinalFieldFix) ois.readObject();
	
		System.out.println(obj3 == obj4);
		
	}

}
