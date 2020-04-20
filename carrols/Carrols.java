package carrols;

import java.util.List;

import builder.*;

public class Carrols extends BurgerBuilder{

	private List <Object> club;
	private TopBun TopBun;
	private BottomBun BottomBun;
	private Patty Patty;
	private MiddleLayerBun MiddleLayer;
	private Sauce Sauce;
	private Salad Salad;
	private Cheese Cheese;
	private Object topBun;
//	private Object bottomBun= "";
//	private Object middleLayer= "";
//	private Object patty= "";
//	private Object sauce= "";
//	private Object salad= "";
//	private Object cheese= "";
	@Override
	
	public Carrols setTopBun() {
		// TODO Auto-generated method stub
		
		this.topBun = TopBun;
		return this;
	}
	@Override
	public Carrols setBottomBun() {
		// TODO Auto-generated method stub
//		this.bottomBun = BottomBun.getInfo();
		return this;
	}
	@Override
	public Carrols setMiddleLayer() {
		// TODO Auto-generated method stub
//		this.middleLayer =MiddleLayer.getInfo();
		return this;
	}
	@Override
	public Carrols setCheese() {
		// TODO Auto-generated method stub
//		this.cheese =Cheese.getInfo();
		return this;
	}
	@Override
	public Carrols setSauce() {
		// TODO Auto-generated method stub
//		this.sauce =Sauce.getInfo();
		return this;
	}
	public Carrols setPatty(){
//		this.patty =Patty.getInfo();	
		return this;	
	}
	
	@Override
	public Carrols setSalad() {
		// TODO Auto-generated method stub
//		this.salad = Salad.getInfo();
		return this;
	}
	public Carrols( ){ 
		}
	
	
	public List getBurger() {
		System.out.println("over here " + topBun.toString());
		System.out.println("over here ");
		//Burger burger= new Burger(this.bottomBun,this.topBun, this.cheese, this.middleLayer, this.patty, this.salad, this.sauce);
//		club.add(burger.getSalad());
//		club.add(burger.getSauce());
//		club.add(burger.getPatty());
//		club.add(burger.getMiddleLayer());
//		club.add(burger.getPatty());
//		club.add(burger.getCheese());
//		club.add(burger.getTopBun());
//		System.out.println(burger.getTopBun());
		return club;
	}

}
