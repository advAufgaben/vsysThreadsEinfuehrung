package synchronization;

public class ThreadB extends Thread {
	
	Thread threadA;
	Ressource ressource;
	
	public ThreadB(Ressource ressource, Thread threadA) {
		this.ressource = ressource;
		this.threadA = threadA;
	}
	
	@Override
	public void run() {
		System.out.println("Thread B ist gestartet");
		System.out.println("Thread B wartet auf Thread A");
		try {
			threadA.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread B liest");
		String text = ressource.Text;
		System.out.println("Text von Thread A: " + text);
		System.out.println("Thread B beendet sich");
	}
}
