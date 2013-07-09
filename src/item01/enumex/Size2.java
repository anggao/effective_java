package item01.enumex;

public enum Size2 {
	SMALL("S"), MIDDLE("M"), LARGE("L");
	
	private String abbr;
	
	private Size2(String abbr){
		this.abbr = abbr;
	}
	
	public String getAbbr(){
		return abbr;
	}
	
	public static void main(String[] args) {
		System.out.println(Size2.MIDDLE.getClass());
		System.out.println(Size2.MIDDLE instanceof Size2);
	}
}
