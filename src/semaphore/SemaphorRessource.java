package semaphore;

import java.util.concurrent.Semaphore;

public class SemaphorRessource {
	
	/* Semaphor-Objekt */
	public Semaphore semaphor;
	
	/* Konstruktor mit "int"-Zahl */
	public SemaphorRessource(int i) {
		/* Neues Semaphor-Objekt mit "i" Zugriffen */
		semaphor = new Semaphore(i);
	}
}
