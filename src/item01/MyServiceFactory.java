package item01;

/* The class of the object returned by a static factory method need not even 
 * exist at the time the class containing the method is written
 */
public class MyServiceFactory {
	public static MyService getService() {
		try {
			return (MyService) Class.forName(
					System.getProperty("MyServiceImplementation"))
					.newInstance();
		} catch (Throwable t) {
			throw new Error(t);
		}
	}
}
