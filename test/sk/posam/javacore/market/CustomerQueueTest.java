package sk.posam.javacore.market;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CustomerQueueTest {

	@Test
	void test1() {
		assertEquals(12, CustomerQueue.queueTime( new int[] { 5,3,4 }, 1) );
	}

	@Test
	void test2() {
		assertEquals(10, CustomerQueue.queueTime( new int[] {10,2,3,3}, 2) );
	}

	@Test
	void test3() {
		assertEquals(12, CustomerQueue.queueTime( new int[] { 2,3,10 }, 2) );
	}

}
