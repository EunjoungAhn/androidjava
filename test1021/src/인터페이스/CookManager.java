package 인터페이스;

public class CookManager {
	ICook cook;
	
	public CookManager(String food){
		if (food.equals("한식")) {
			cook = new KoreanCook();
		}else if(food.equals("중식")) {
			cook = new ChineseCook();
		}else {
			cook = new IndoCook();
		}
	}
	public void soup() {
		cook.soup();
	}
	public void food() {
		cook.food();
	}
}
