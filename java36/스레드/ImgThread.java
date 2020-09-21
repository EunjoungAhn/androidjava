package 스레드;

public class ImgThread extends Thread {
	@Override
	public void run() {
		String[] img = {"1.png","2.png","3.png","4.png","5.png",};
		for (int i = 0; i < img.length; i++) {
			System.out.println("이미지: "+img[i]);
			try {//그렇기 때문에 try, catch로 예외처리를 한다.
				Thread.sleep(3000);
			} catch (InterruptedException e) {//에러가 발생시 'e'에 에 정보를 담아 준다.
				e.printStackTrace();//에러가 어디있는지 출력해주는 함수
			}
		}
	}
}
