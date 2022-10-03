package sk.posam.javacore.market;

/**
 * 
 * V obchode je jeden rad zákazníkov, ktorý obsluhuje niekoľko pokladní. Tvojou
 * úlohou je zistiť, ako dlho bude trvať, kým obchod obslúži všetkých
 * zákazníkov.
 * 
 * vstup: customers: int[] zoznam kladných celých čísel, ktorý reprezentuje
 * zákazníkov. Číslo označuje čas, ako dlho bude trvať obslúžiť daného
 * zákazníka. cashDesks: int počet pokladní
 * 
 * výstup celé číslo, ktoré hovorí o tom, koľko času trvalo obslúžiť všetkých
 * zákazníkov.
 * 
 * Príklady
 * queueTime([5,3,4], 1) -> 12
 * queueTime([10,2,3,3], 2) -> 12
 * queueTime([2,3,10], 2) -> 12
 * 
 * Zákazníci vždy čakajú, kým sa pokladňa uvoľní. Akonáhle sa nejaká uvoľní,
 * hneď idú k tej voľnej.
 * 
 */
public class CustomerQueue {

	public static int queueTime(int[] customers, int cashDesks) {
		return 12;
	}

}
