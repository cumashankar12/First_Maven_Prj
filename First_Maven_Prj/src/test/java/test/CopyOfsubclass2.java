package test;

public enum CopyOfsubclass2 {
	FIRST("a"),
	SECOND("b"),
	THIRD("c");
	
	private String b;
	CopyOfsubclass2 (String a){
		b = a;
	}
	public String en(){
		return b;
	}
	
}
