package maven.Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFirst {

	@Test 
	public void test() {
		//fail("Not yet implemented");
		//System.out.println("Test Passed");
		FirstDemo sum=new FirstDemo();
		int r=8;
		int compute=sum.add(5, 3);
		assertEquals("add failed", r,compute);
	}
}
