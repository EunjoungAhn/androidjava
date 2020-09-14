package 상속응용;

public class CoffeeTruck extends Truck{
	//변수, 메서드 1개씩 
		String menu;
		
		public void iceCoffee() {
			System.out.println("아이스커피 입니다.");
		}

		@Override
		public String toString() {
			return "coffeeTruck [menu=" + menu + ", year=" + year + ", owner=" + owner + ", company=" + company + "]";
		}
}
