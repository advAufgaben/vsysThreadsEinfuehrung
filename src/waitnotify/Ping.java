package waitnotify;

public class Ping extends Thread {
	private Ressource ressource;
	public Ping(Ressource ressource){
		super();
		this.ressource = ressource;
	}
	
	@Override
	public void run(){
		for(int i = 1; i <= 3; i++){
			synchronized(ressource){
				System.out.println("Ping schreibt");
				ressource.text = "Ping was here " + i;
				ressource.pingGeschrieben = true;
				ressource.notify();
			}
			synchronized(ressource){
				while(!ressource.pongGeschrieben){
					try {
						System.out.println("Ping wartet");
						ressource.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Ping liest: " + ressource.text);
				ressource.pongGeschrieben = false;
			}
		}
		System.out.println("Ping Ende");
	}
}
