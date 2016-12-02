package mutex;

public class MutexHaupt {

	public static void main(String[] args) {
		MutexRessource	R = new MutexRessource();
		MutexBearbeiter	B1 = new MutexBearbeiter(R, 1);
		MutexBearbeiter	B2 = new MutexBearbeiter(R, 2);
		B1.start();
		B2.start();
	}

}
