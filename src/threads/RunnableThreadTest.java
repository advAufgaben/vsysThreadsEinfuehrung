package threads;

public class RunnableThreadTest {
	
	public static void main(String[] args) {
		
		Thread thread = new Thread(new NeuesRunnable());
		thread.start();
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
	
	public static class NeuesRunnable implements Runnable {
		
		@Override
		public void run() {
			try{
				System.out.println("Ich bin der neue Thread!");
				Thread.sleep(500);
				System.out.println("Ich bin der neue Thread!");
				Thread.sleep(500);
				System.out.println("Ich bin der neue Thread!");
				Thread.sleep(500);
			} catch(Exception e){
				System.err.println(e);
			}
		}
		
	}
}
