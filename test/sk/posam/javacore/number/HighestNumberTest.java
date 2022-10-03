package sk.posam.javacore.number;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HighestNumberTest {

	@Test
	void test1() {
		assertEquals(321, HighestNumber.highest(123) );
	}

	@Test
	void test2() {
		assertEquals(876, HighestNumber.highest(768) );
	}
	
	@Test
	void test3() {
		assertEquals(987771, HighestNumber.highest(717879) );
	}
	
	@Test
	void test4() {
		assertEquals(771, HighestNumber.highest(177) );
	}

}
