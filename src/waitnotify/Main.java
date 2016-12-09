package waitnotify;

public class Main {
	
	public static void main(String[] args) {
		Ressource ressource = new Ressource();
		Thread ping = new Ping(ressource);
		Thread pong = new Pong(ressource);
		ping.start();
		pong.start();
	}
	
}
