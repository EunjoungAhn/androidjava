package 인터페이스;

public class BananaCar implements Car {

	@Override
	public void fast() {
		System.out.println("바나나 빠름~~");
	}

	@Override
	public void slow() {
		System.out.println("바나나 느림~~");
	}

}
