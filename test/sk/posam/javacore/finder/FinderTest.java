package sk.posam.javacore.finder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FinderTest {

	@Test
	void testWithWall() {

		String a = ".W.\n" + 
		           ".W.\n" + 
				   "...";

		assertEquals(true, Finder.pathFinder(a));
	}
	
	@Test
	void testNotSuccess() {

		String b =  ".W.\n" + 
				    ".W.\n" + 
					"W..";
		assertEquals(false, Finder.pathFinder(b));
	}
	@Test
	void biggerMaze() {

		String c = "......\n" +
				    "......\n" + 
				    "......\n" + 
				    "......\n" + 
				    "......\n" + 
				    "......";
		assertEquals(true, Finder.pathFinder(c));
	}
	@Test
	void onePath() {

		String c =  "..W...\n" +
				    "W.W.W.\n" + 
				    "..W.W.\n" + 
				    ".WW.W.\n" + 
				    "....W.\n" + 
				    "WWWWW.";
		assertEquals(true, Finder.pathFinder(c));
	}
	@Test
	void testDeadEnd() {

		String d =  "......\n" + 
				    "......\n" + 
					"......\n" + 
				    "......\n" + 
					".....W\n" + 
				    "....W.";

		assertEquals(false, Finder.pathFinder(d));
	}
}
