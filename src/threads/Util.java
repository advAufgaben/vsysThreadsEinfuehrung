package threads;

public final class Util {
	
	public static void sleep(int duration){
		try {
			Thread.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
