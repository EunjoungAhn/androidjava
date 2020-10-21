package 인터페이스;

public class IndoCook implements ICook{

	@Override
	public void soup() {
		System.out.println("카레");
	}

	@Override
	public void food() {
		System.out.println("난");
	}
	
}
