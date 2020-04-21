package builder;
import java.util.ArrayList;

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
		ArrayList <String> order2 = new ArrayList();
		herbert.setTopBun();
		herbert.setBottomBun();
		herbert.setCheese();
		herbert.setPatty();
		herbert.setMiddleLayer();
		herbert.setSalad();
		herbert.setSauce();
		herbert.setCheese();
		order2 = herbert.getBurger();
		System.out.println("Club burger");
		int i =0;
		for ( i=0; i<order2.size();i++) {
			System.out.println(order2.get(i));
		}
		
		//System.out.println(order2);
	}

}
