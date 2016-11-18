package semaphore;

import werkzeuge.Eingaben;

public class SemaphorTest {
	
	public static void main(String[] args) {
		/* Anzahl der Threads */
		int	anzahl = Eingaben.intEingabe("Anzahl der Threads: ");
		/* Neues Ressourcenobjekt mit 2 Zugriffen */
		SemaphorRessource	S = new SemaphorRessource(2);
		/* Mehrere neue Threads, die auf dieses Ressourcenobjekt
		 * zugreifen wollen */
		for (int i = 1; i <= anzahl; i++) {
			(new SemaphorThread(i, S)).start();
		}
	}
	
}
