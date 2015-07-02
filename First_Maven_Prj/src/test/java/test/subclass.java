package test;

public class subclass extends mainprg {
	public String var1 = "sub";
public void subclas (){
	System.out.println(this.var1);
	System.out.println(super.var1);
}
public static void main (String args[]){
	subclass sub1 = new subclass();
	sub1.subclas();
}
}
