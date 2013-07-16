package item06.weakref;

import java.util.WeakHashMap;

public class Demo {

	public static void main(String[] args) {
		SampleKey key = new SampleKey(10);
		SampleObject value = new SampleObject("sample value");

		WeakHashMap<SampleKey, SampleObject> weakHashMap = new WeakHashMap<SampleKey, SampleObject>();
		weakHashMap.put(key, value);

		// At this point, we still have a strong reference to the key. Thus,
		// even though the key is weakly-referenced by the WeakHashMap, nothing
		// will be automatically removed even if we give a hint to the GC.
		System.gc();

		System.out.println(weakHashMap.size());
		System.out.println(weakHashMap.get(key));

		// Now, we if set the key to null, the entry in weakHashMap will
		// eventually disappear. Note that the number of times we have to 'kick'
		// the GC before the entry disappears may be different on each run
		// depending on the JVM load, memory usage, etc.
		key = null;
		int count = 0;

		while (0 != weakHashMap.size()) {
			++count;
			System.gc();
		}
		System.out.println("Took " + count
				+ " calls to System.gc() to result in weakHashMap size of : "
				+ weakHashMap.size());
	}
}
