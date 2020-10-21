package 인터페이스;

public class Applecar implements Car {

	@Override
	public void fast() {
		System.out.println("사과 빠름");
	}

	@Override
	public void slow() {
		System.out.println("사과 느림");
	}

}
