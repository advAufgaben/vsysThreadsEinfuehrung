package mutex;

public class MutexRessource {

	private int		Daten = 0;

	public synchronized void bearbeiten(int wert) {
		int		aktuell = this.Daten;
		System.out.println("Thread " + wert + " mit Daten: " + aktuell);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) { }
		System.out.println("Daten werden ge�ndert von Thread " + wert);
		aktuell = aktuell + wert;
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) { }
		this.Daten = aktuell;
		System.out.println("Thread " + wert + " mit Daten jetzt: " + this.Daten);
	}
}
