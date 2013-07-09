package item01.spf;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ServiceManager {
	private ServiceManager() {
	}

	private static final Map<String, ServiceProvider> providers = new ConcurrentHashMap<String, ServiceProvider>();

	// Provider Registration API
	public static void registerProvider(String name, ServiceProvider p) {
		providers.put(name, p);
	}

	public static Service newInstance(String name) {
		ServiceProvider p = providers.get(name);
		if (p == null)
			throw new IllegalArgumentException(
					"No provider registered with name: " + name);
		return p.newService();
	}
}
