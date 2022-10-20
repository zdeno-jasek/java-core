package sk.posam.javacore.comments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveCommentsTest {

	@Test
	void doBatôžkaSiNaložPretvárkuLožAFaloš() {
		assertEquals( "Do batôžka\n"+
				"pretvárku\n"+
				"\n"+
				" a potom ich hoď",  
		RemoveComments.remove(  "Do batôžka # si nalož\n"+
				"pretvárku $ , lož a faloš\n"+
				"#\n"+
				" a potom ich hoď $ všetky do vody.", new String[] { "#", "$" } ) );
	}

	@Test
	void tooSimpleToFail() {
		assertEquals( "",  
		RemoveComments.remove(  "#", new String[] { "#", "$" } ) );
	}

	@Test
	void dontRemoveEmptyLines() {
		assertEquals( "\n\n",  
		RemoveComments.remove(  "  \n"+
				"#remove this\n"+
				"$remove that", new String[] { "#", "$" } ) );
	}

	@Test
	void removeAnotherCommentChars() {
		assertEquals( "Lasica\n",  
		RemoveComments.remove(  "Lasica & Satinský\n"+
				"xFilip", new String[] { "&", "x" } ) );
	}

}
