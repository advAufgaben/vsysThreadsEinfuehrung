package mutex;

public class MutexBearbeiter extends Thread {

	private MutexRessource	R;
	private int			Nummer;

	public MutexBearbeiter(MutexRessource r, int i) {
		this.R = r;
		this.Nummer = i;
	}

	public void run() {
		System.out.println("Thread " + this.Nummer + " ist gestartet");
		this.R.bearbeiten(this.Nummer);
		System.out.println("Thread " + this.Nummer + " wird beendet");
	}
}
