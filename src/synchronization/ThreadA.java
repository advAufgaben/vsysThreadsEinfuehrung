package synchronization;

public class ThreadA extends Thread {
	private Ressource ressource;
	
	public ThreadA(Ressource ressource) {
		this.ressource = ressource;
	}
	
	@Override
	public void run() {
		System.out.println("Thread A ist gestartet");
		System.out.println("Thread A schreibt in Ressource");
		ressource.Text = "Thread A was here";
		System.out.println("Thread A beendet sich");
	}
}
