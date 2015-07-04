package test;

import org.testng.annotations.Test;

public class subclass extends mainprg {
	public String var1 = "sub";
	@Test()
	
public void subclas (){
	System.out.println(this.var1);
	System.out.println(super.var1);
}

}
