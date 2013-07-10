package item03;

public enum SingletonEnum {

	INSTANCE;
	
	public void doAction(){
		System.out.println("Testing");
	}
	
	public static void main(String[] args) {
		SingletonEnum.INSTANCE.doAction();
	}
}
