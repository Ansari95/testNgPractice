package TestNg;

import org.apache.xalan.xsltc.compiler.sym;
import org.testng.annotations.Test;

public class IncludeAndExcludeExa {
	
	@Test
	void excludeMethod() {
		
		System.out.println("exlude method");
	}
	
	@Test
	void includeMethod() {
		
		System.out.println("include method");
	}
	

}
