package threads;

import java.io.File;
import java.io.IOException;

public class GemeinsamAufruf {
	
	public static void main(String[] args) {
		Gemeinsam	G1 = new Gemeinsam(1);
		Gemeinsam	G2 = new Gemeinsam(2);
		G1.start();
		G2.start();
	}
	
	public static class Gemeinsam extends Thread {
		
		private static final File SPERRDATEI = new File("lock");
		
		public static int	zahl = 10;
		public int			nummer;
		
		public Gemeinsam(int i) {
			this.nummer = i;
		}
		
		@Override
		public void run() {
			while(!createLockFile(SPERRDATEI)){
				Util.sleep(50);
			}
			
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
			
			SPERRDATEI.delete();
		}
		
		private static boolean createLockFile(File lock){
			try {
				return lock.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return false;
		}
	}
	
}
