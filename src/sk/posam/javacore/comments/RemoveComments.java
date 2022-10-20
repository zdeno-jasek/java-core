package sk.posam.javacore.comments;

/**
 *
 * Odstráňte zakomentovaný text. Komentár sa môže začínať hociktorým jedným znakom, ktorý príde na vstupe.
 * Komentárových znakov môže byť viac. Odstrániť zakomentovaný text znamená odstrániť zvyšok textu v riadku až po koniec riadku.
 * 
 * Napríklad ak je komentárový text # a $, potom nasledujúci text:
 * "Do batôžka # si nalož "
 * "# pretvárku $ , lož a faloš "
 * " #"
 * " a potom ich hoď $ všetky do vody."
 * 
 * Vygeneruje text:
 * "Do batôžka"
 * ""
 * ""
 * " a potom ich hoď"
 * 
 * Pozor: prázdne znaky nesmú byť na konci riadku! Ani keď je zadaný vstupný text bez komentára s medzerou na konci, 
 * tak vo výstupe tá medzera musí byť odstránená. Všimni si to na uvedenom príklade, ako vyzerá riadok " a potom ich hoď".
 * Počet riadkov musí byť zachovaný.
 *
 */
public class RemoveComments {
	
	public static String remove( String originalText, char[] commentChars ) {
		return "";
	}

}
