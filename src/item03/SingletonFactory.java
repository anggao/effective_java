package item03;

public class SingletonFactory {
	private SingletonFactory() {}
	private static final SingletonFactory INSTANCE = new SingletonFactory();
	
	public static SingletonFactory getInstance(){
		return INSTANCE;
	}
	
	public void doAction(){
		System.out.println("Testing");
	}
	
	public static void main(String[] args) {
		SingletonFactory.getInstance().doAction();
	}
}
