package sk.posam.javacore.sortchar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SortCharsTest {

	@Test
	void test1() {
		assertEquals( "AaBbCc", SortChars.sort( "aAcCBb") );
	}

	@Test
	void test2() {
		assertEquals( "AaaBbbbCcc", SortChars.sort( "baAcCaBcbb") );
	}

	@Test
	void test3() {
		assertEquals( "AaaBbbCcc", SortChars.sort( "cabCABbac") );
	}

}
