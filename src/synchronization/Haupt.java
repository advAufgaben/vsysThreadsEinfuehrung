package synchronization;

public class Haupt {
	
	public static void main(String[] args) {
		// Neue Ressource
		Ressource ressource = new Ressource();
		// Neuer ThreadA
		Thread a = new ThreadA(ressource);
		// Neuer ThreadB
		Thread b = new ThreadB(ressource, a);
		// ThreadA, ThreadB starten
		a.start();
		b.start();
	}
	
}
