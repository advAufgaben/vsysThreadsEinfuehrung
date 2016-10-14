package threads;

public class AuslastungsTest {
	
	public static void main(String[] args) {
		for(int i = 0; i < 8; i++){
			Thread t = new EndlosThread();
			t.start();
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
