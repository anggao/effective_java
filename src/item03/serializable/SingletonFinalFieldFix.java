package item03.serializable;

import java.io.Serializable;

public class SingletonFinalFieldFix implements Serializable{

	public static final SingletonFinalFieldFix INSTANCE = new SingletonFinalFieldFix();
	private SingletonFinalFieldFix(){}
	
	public void doAction(){
		System.out.println("Testing");
	}
	
	// readResolve method to preserve singleton property
	private Object readResolve() {
		return INSTANCE;
	}

	public static void main(String[] args) {
		SingletonFinalFieldFix.INSTANCE.doAction();
	}
}
