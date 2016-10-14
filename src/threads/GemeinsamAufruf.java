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
		
		private static final String SPERRDATEI_PFAD = "/lock";
		
		public static int	zahl = 10;
		public int			nummer;
		
		public Gemeinsam(int i) {
			this.nummer = i;
		}
		
		@Override
		public void run() {
			int		x;
			System.out.println("Thread Nr. " + this.nummer + ", Zahl: " + Gemeinsam.getZahl());
			x = Gemeinsam.getZahl();
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) { }
			Gemeinsam.setZahl(x + this.nummer);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) { }
			System.out.println("Thread Nr. " + this.nummer + ", Zahl: " + Gemeinsam.getZahl());
		}
		
		private static void createLockFile(File lock){
			try {
				lock.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public static int getZahl() {
			File lock = new File(SPERRDATEI_PFAD);
			while(lock.exists()){
				Util.sleep(50);
			}
			
			createLockFile(lock);
			
			int readValue = zahl;
			
			lock.delete();
			
			return readValue;
		}
		
		public static void setZahl(int zahl) {
			File lock = new File(SPERRDATEI_PFAD);
			while(lock.exists()){
				Util.sleep(50);
			}
			
			createLockFile(lock);
			
			Gemeinsam.zahl = zahl;
			
			lock.delete();
		}
		
	}
	
}
