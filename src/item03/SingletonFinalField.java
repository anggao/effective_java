package item03;

import java.io.Serializable;

public class SingletonFinalField implements Serializable{

	public static final SingletonFinalField INSTANCE = new SingletonFinalField();
	private SingletonFinalField(){}
	
	public void doAction(){
		System.out.println("Testing");
	}
	
	public static void main(String[] args) {
		SingletonFinalField.INSTANCE.doAction();
	}
}
