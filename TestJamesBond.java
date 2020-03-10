package test;

import student.JamesBond;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestJamesBond {

	@Test
	public void testGetIndexOfChar() {

		int tolerance = 0;
		int actualValue;
		int expectedValue;

		
		
		actualValue = JamesBond.getIndexOfChar('d');
		expectedValue = 3;
		assertEquals(expectedValue, actualValue, tolerance);

		actualValue = JamesBond.getIndexOfChar('a');
		expectedValue = 0;
		assertEquals(expectedValue, actualValue, tolerance);

		actualValue = JamesBond.getIndexOfChar('v');
		expectedValue = 21;
		assertEquals(expectedValue, actualValue, tolerance);

		actualValue = JamesBond.getIndexOfChar('i');
		expectedValue = 8;
		assertEquals(expectedValue, actualValue, tolerance);

		actualValue = JamesBond.getIndexOfChar('d');
		expectedValue = 3;
		assertEquals(expectedValue, actualValue, tolerance);
	}
	
	
	@Test(expected = RuntimeException.class)
	public void testGetIndexOfCharBadChar() {
		
		//assert that this symbol has no index
		JamesBond.getIndexOfChar('$');
	}
	
	
	@Test
	public void testCypher() {

		String actualValue;
		String expectedValue;

		actualValue = JamesBond.cypher("icam", 0);
		expectedValue ="icam";
		assertEquals(expectedValue, actualValue);

		actualValue = JamesBond.cypher("icam", 1);
		expectedValue ="jdbn";
		assertEquals(expectedValue, actualValue);

		actualValue = JamesBond.cypher("icam", 2);
		expectedValue ="keco";
		assertEquals(expectedValue, actualValue);
		
		actualValue = JamesBond.cypher("icam", 3);
		expectedValue ="lfdp";
		assertEquals(expectedValue, actualValue);
		
		
		actualValue = JamesBond.cypher("icam", 4);
		expectedValue ="mgeq";
		assertEquals(expectedValue, actualValue);
		

		//to be continued...
		
		
	}
	
	@Test
	public void testDecypher() {

		String actualValue;
		String expectedValue;

		actualValue = JamesBond.decypher("icam", 0);
		expectedValue ="icam";
		assertEquals(expectedValue, actualValue);

		actualValue = JamesBond.decypher("jdbn", 1);
		expectedValue ="icam";
		assertEquals(expectedValue, actualValue);

		actualValue = JamesBond.decypher("keco", 2);
		expectedValue ="icam";
		assertEquals(expectedValue, actualValue);
		
		actualValue = JamesBond.decypher("lfdp", 3);
		expectedValue ="icam";
		assertEquals(expectedValue, actualValue);
		
		
		actualValue = JamesBond.decypher("mgeq", 4);
		expectedValue ="icam";
		assertEquals(expectedValue, actualValue);
		

		//to be continued...
		
	}
	
	@Test
	public void testCypherAndDecypher() {


		for (int shiftKey = 0; shiftKey < JamesBond.ALPHABET.length; shiftKey++) {
			
			String cypheredText = JamesBond.cypher("icam", shiftKey);
			String decypheredText = JamesBond.decypher(cypheredText, shiftKey);
			
			String expectedValue = "icam";
			assertEquals( "Wrong value with key " + shiftKey, expectedValue, decypheredText);
			
			
		}
		
		

		

		
	}

}
