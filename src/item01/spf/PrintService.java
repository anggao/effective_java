package item01.spf;

public class PrintService implements ServiceProvider{
	static{
		ServiceManager.registerProvider("Printer", new PrintService());
	}

	@Override
	public Service newService() {
		return new Printer();
	}
	
	private class Printer implements Service{

		@Override
		public void doService() {
			System.out.println("Printer Service");
		}
	}

}
