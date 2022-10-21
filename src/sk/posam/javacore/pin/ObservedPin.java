package sk.posam.javacore.pin;

import java.util.Collections;
import java.util.List;

/**
 * Zlodejská výpomoc
 * 
 * Zlodejovi sa podarilo nenápadne zistiť PIN odpozeraním od miestneho oligarchu na tlačidlovom vstupe:
 * ┌───┬───┬───┐
 * │ 1 │ 2 │ 3 │
 * ├───┼───┼───┤
 * │ 4 │ 5 │ 6 │
 * ├───┼───┼───┤
 * │ 7 │ 8 │ 9 │
 * └───┼───┼───┘
 *     │ 0 │
 *     └───┘
 *     
 * Nevie však ten PIN presne, lebo podmienky pre zachytávanie PINu neboli práve ideálne.
 * Takže ak si poznačil PIN 1590, pokojne to mohlo byť v skutočnosti aj 2680, lebo čísla môžu (ale nemusia) byť posunuté 
 * v horizontálnom alebo vertikálnom smere. Takže namiesto "5" má byť správne "2", alebo "4", "8" alebo "6".
 * 
 *  Napíšte metódu, ktorá pre zadaný zistený PIN vráti všetky možnosti, ktoré pripadajú do úvahy na správne zadanie PINu.
 *  Vstup môže byť ľubovoľne dlhý string. 
 *  Napríklad pre vstup "1" vráti "1", "2" a "4".
 *  Pre "11" vráti "11", "12" "14", "22" atď.
 *
 */
public class ObservedPin {

	public static List<String> getPINs(String observed) {
        return Collections.emptyList();
    }
    
}
