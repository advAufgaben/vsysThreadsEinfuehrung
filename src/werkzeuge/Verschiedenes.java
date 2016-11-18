package werkzeuge;

/* Sammlung verschiedener n�tzlicher Methoden */
public class Verschiedenes {

	/* Wrapper-Methode f�r "Thread.sleep";
	   erwartet Anzahl Millisekunden "ms"
	   versteckt "try-catch" */
	public static void warten(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
