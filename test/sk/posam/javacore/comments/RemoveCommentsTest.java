package sk.posam.javacore.comments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveCommentsTest {

	@Test
	void test() {
		assertEquals( "Do batôžka\n"+
				"pretvárku\n"+
				"\n"+
				" a potom ich hoď $ všetky do vody.",  
		RemoveComments.remove(  "Do batôžka # si nalož\n"+
				"pretvárku $ , lož a faloš\n"+
				"#\n"+
				"a potom ich hoď $ všetky do vody.", new char[] { '#', '$' } ) );
	}

}
