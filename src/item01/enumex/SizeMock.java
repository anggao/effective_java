package item01.enumex;

/*
 * Simulate enum
 */
public class SizeMock {

	private String abbr;

	SizeMock() {
	}

	SizeMock(String abbr) {
		this.abbr = abbr;
	}

	String getAbbr() {
		return this.abbr;
	}

	static class MIDDLE extends SizeMock {
		MIDDLE(String abbr) {
			super(abbr);
		}
	}

	static class SMALL extends SizeMock {
		SMALL(String abbr) {
			super(abbr);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(new SizeMock.SMALL("S").getAbbr());
		System.out.println(new SizeMock.MIDDLE("M").getAbbr());
	}
}
