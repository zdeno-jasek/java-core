package sk.posam.javacore.pin;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

class ObservedPinTest {

    private final static Comparator<String> comp = (s1, s2) -> s1.compareTo(s2);
    
    @Test
    void test8() {
    	test( Arrays.asList( "5", "7", "8", "9", "0" ), ObservedPin.getPINs( "8" ) );
    }

    @Test
    void test11() {
    	test( Arrays.asList( "11", "21", "41", "12", "22", "42", "14", "24", "44" ), ObservedPin.getPINs( "11" ) );
    }

    @Test
    void test369() {
    	test( Arrays.asList( "236", "238", "239", "256", "258", "259", "266", "268", "269", "296", "298", "299", "336", "338", "339", "356", "358", "359", "366", "368", "369", "396", "398", "399", "636", "638", "639", "656", "658", "659", "666", "668", "669", "696", "698", "699" ), 
    			ObservedPin.getPINs( "369" ) );
    }

    private void test( List<String> expected, List<String> result) {
        result.sort(comp);
        expected.sort(comp);
        assertEquals(expected, result);
    }

}
