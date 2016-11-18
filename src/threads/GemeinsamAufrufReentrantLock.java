package threads;

import java.util.concurrent.locks.ReentrantLock;

public class GemeinsamAufrufReentrantLock {
	
	public static void main(String[] args) {
		Gemeinsam	G1 = new Gemeinsam(1);
		Gemeinsam	G2 = new Gemeinsam(2);
		G1.start();
		G2.start();
	}
	
	public static class Gemeinsam extends Thread {
		
		private static final ReentrantLock SPERRE = new ReentrantLock();
		
		public static int	zahl = 10;
		public int			nummer;
		
		public Gemeinsam(int i) {
			this.nummer = i;
		}
		
		@Override
		public void run() {
			SPERRE.lock();
			System.out.println("Thread Nr. " + this.nummer + " hat gesperrt");
			int		x;
			System.out.println("Thread Nr. " + this.nummer + ", Zahl: " + zahl);
			x = zahl;
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			zahl = x + this.nummer;
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread Nr. " + this.nummer + ", Zahl: " + zahl);
			
			SPERRE.unlock();
			System.out.println("Thread Nr. " + this.nummer + " hat entsperrt");
		}
	}
}
