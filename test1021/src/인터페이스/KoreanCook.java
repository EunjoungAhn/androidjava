package 인터페이스;

public class KoreanCook implements ICook{

	@Override
	public void soup() {
		System.out.println("김치찌개");
	}

	@Override
	public void food() {
		System.out.println("김치");
	}
	
}
