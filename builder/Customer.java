package builder;
import carrols.Carrols;
import mcDonalds.*;
public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		McDonalds ronald = new McDonalds();
		String order;
		ronald.setTopBun();
		ronald.setBottomBun();
		ronald.setCheese();
		ronald.setPatty();
		ronald.setMiddleLayer();
		ronald.setSalad();
		ronald.setSauce();
		ronald.setCheese();
		order = ronald.getBurger().toString();
		System.out.println("Big Mac burger");
		System.out.println(order);
		
		System.out.println("Next: ");
		Carrols herbert = new Carrols();
		String order2;
		herbert.setTopBun();
		herbert.setBottomBun();
		herbert.setCheese();
		herbert.setPatty();
		herbert.setMiddleLayer();
		herbert.setSalad();
		herbert.setSauce();
		herbert.setCheese();
		order2 = herbert.getBurger().toString();
		System.out.println("Club burger");
		System.out.println(order2);
	}

}
