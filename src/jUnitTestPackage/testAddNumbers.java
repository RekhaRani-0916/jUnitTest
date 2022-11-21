package jUnitTestPackage;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
// import static org.junit.jupiter.api.Assertions.*;


import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunctions JUnit = new jUnitFunctions();
		int result = JUnit.addint(100, 200);
		assertEquals (300,result);
	}

}
