package waitnotify;

public class Pong extends Thread {
	private Ressource ressource;
	public Pong(Ressource ressource){
		super();
		this.ressource = ressource;
	}
	
	@Override
	public void run(){
		for(int i = 1; i <= 3; i++){
			synchronized(ressource){
				while(!ressource.pingGeschrieben){
					try {
						System.out.println("Pong wartet");
						ressource.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Pong liest: " + ressource.text);
				ressource.pingGeschrieben = false;
			}
			synchronized(ressource){
				System.out.println("Pong schreibt");
				ressource.text = "Pong was here " + i;
				ressource.pongGeschrieben = true;
				ressource.notify();
			}
		}
		System.out.println("Pong Ende");
	}
}
