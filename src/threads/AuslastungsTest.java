package threads;

public class AuslastungsTest {
	
	public static void main(String[] args) {
		Thread[] threads = new Thread[8];
		for(int i = 0; i < 8; i++){
			threads[i] = new EndlosThread();
			threads[i].start();
		}
		
	}
	
	public static class EndlosThread extends Thread{
		@SuppressWarnings("unused")
		@Override
		public void run(){
			while(true){
				int i = 1 + 1;
			}
		}
	}
	
}
