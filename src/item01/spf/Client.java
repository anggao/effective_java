package item01.spf;

public class Client {

	public static void main(String[] args) throws Exception {
		Class.forName("item01.spf.PrintService");
		Class.forName("item01.spf.ScanService");

		Service printer = ServiceManager.newInstance("Printer");
		printer.doService();

		Service scanner = ServiceManager.newInstance("Scanner");
		scanner.doService();

	}

}
