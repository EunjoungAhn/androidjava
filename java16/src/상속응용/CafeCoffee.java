package 상속응용;

public class CafeCoffee extends CoffeeTruck{

	public static void main(String[] args) {
		CafeCoffee cc = new CafeCoffee();
		cc.company = "아이스커피 트럭회사";
		cc.owner = "김 아이스";
		cc.year = 2020;
		cc.menu = "아이스커피";
		
		cc.run();
		cc.start();
		cc.iceCoffee();
		System.out.println(cc);
	}
}
