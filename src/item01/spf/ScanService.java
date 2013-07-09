package item01.spf;

public class ScanService implements ServiceProvider {
	static{
		ServiceManager.registerProvider("Scanner", new ScanService());
	}

	@Override
	public Service newService() {
		return new Scanner();
	}

	private class Scanner implements Service {

		@Override
		public void doService() {
			System.out.println("Scanner Service");
		}
	}

}
