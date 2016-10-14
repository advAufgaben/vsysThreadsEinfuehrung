package threads;

public class MehrNummerierteThreadsTest {
	
	public static void main(String[] args) {
		Thread[] threads = new Thread[]{
				new NummerierterThread(1),
				new NummerierterThread(2),
				new NummerierterThread(3)
		};
		for(Thread t : threads){
			t.start();
		}
		try {
			System.out.println("Hallo");
			Thread.sleep(500);
			System.out.println("Hallo");
			Thread.sleep(500);
			System.out.println("Hallo");
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static class NummerierterThread extends Thread {
		
		private int nummer;
		
		public NummerierterThread(int nummer){
			super();
			this.setNummer(nummer);
		}
		
		@Override
		public void run() {
			try{
				
				System.out.println("Ich bin der neue Thread Nummer " + this.getNummer());
				Thread.sleep(500);
				System.out.println("Ich bin der neue Thread Nummer " + this.getNummer());
				Thread.sleep(500);
				System.out.println("Ich bin der neue Thread Nummer " + this.getNummer());
				Thread.sleep(500);
			} catch(Exception e){
				System.err.println(e);
			}
		}
		
		public int getNummer() {
			return nummer;
		}
		
		public void setNummer(int nummer) {
			this.nummer = nummer;
		}
		
	}
	
}
