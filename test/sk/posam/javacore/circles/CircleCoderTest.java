package sk.posam.javacore.circles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleCoderTest {

	@Test
	void testCode() {
		assertEquals( "csordaew", CircleCoder.encode("codewars") );
	    assertEquals("wehti", CircleCoder.encode("white"));
	    assertEquals("Atsrse", CircleCoder.encode("Assert"));
	    assertEquals("H!edlllroo w", CircleCoder.encode("Hello world!"));
	    assertEquals("Y.oaut ahka vsei hcth oesteanl stnoa rt", CircleCoder.encode("You have chosen to translate this kata."));		
	}
	
	  @Test
	  public void testDecode() {
	    assertEquals("codewars", CircleCoder.decode("csordaew"));
	    assertEquals("white", CircleCoder.decode("wehti"));
	    assertEquals("Assert", CircleCoder.decode("Atsrse"));
	    assertEquals("Hello world!", CircleCoder.decode("H!edlllroo w"));
	    assertEquals("You have chosen to translate this kata.", CircleCoder.decode("Y.oaut ahka vsei hcth oesteanl stnoa rt"));
	  }

}
