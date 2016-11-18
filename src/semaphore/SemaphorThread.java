package semaphore;

public class SemaphorThread extends Thread {
	
	/* Nummer des Threads */
	private int	Nr;
	/* Referenz auf Ressource */
	private SemaphorRessource ressource;
	
	/* Konstruktor mit Nummer des Threads und Referenz auf Ressource */
	public SemaphorThread(int i, SemaphorRessource S) {
		super();
		this.Nr = i;
		this.ressource = S;
	}
	
	@Override
	public void run() {
		System.out.println("Thread " + this.Nr + " ist gestartet");
		try {
			Thread.sleep((int)(Math.random() * 100));
		} catch (InterruptedException e) { }
		System.out.println("Thread " + this.Nr + " will Ressource sperren");
		try {
			ressource.semaphor.acquire();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println("Thread " + this.Nr + " hat Ressource gesperrt");
		try {
			Thread.sleep((int)(Math.random() * 100));
		} catch (InterruptedException e) { }
		System.out.println("Thread " + this.Nr + " gibt Ressource frei");
		ressource.semaphor.release();
		try {
			Thread.sleep((int)(Math.random() * 100));
		} catch (InterruptedException e) { }
		System.out.println("Thread " + this.Nr + " beendet sich");
	}
}
