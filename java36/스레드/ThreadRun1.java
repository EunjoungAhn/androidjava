package 스레드;

public class ThreadRun1 {
	public static void main(String[] args) {
		StarThread star = new StarThread();
		CircleThread cir = new CircleThread();
		star.start();
		cir.start();
	}
}
