package carrols;

import java.util.ArrayList;

import builder.*;

public class Carrols extends BurgerBuilder{

	private ArrayList <String> club = new ArrayList(8);
	private TopBun TopBun = new TopBun();
	private BottomBun BottomBun= new BottomBun();
	private Patty Patty = new Patty();
	private MiddleLayerBun MiddleLayer = new MiddleLayerBun();
	private Sauce Sauce = new Sauce();
	private Salad Salad = new Salad();
	private Cheese Cheese = new Cheese();
	private String topBun = "";
	private String bottomBun= "";
	private String middleLayer= "";
	private String patty= "";
	private String sauce= "";
	private String salad= "";
	private String cheese= "";
	@Override
	
	public Carrols setTopBun() {
		// TODO Auto-generated method stub
		this.topBun = TopBun.getInfo();
		return this;
	}
	@Override
	public Carrols setBottomBun() {
		// TODO Auto-generated method stub
		this.bottomBun = BottomBun.getInfo();
		//System.out.println(bottomBun);
		return this;
	}
	@Override
	public Carrols setMiddleLayer() {
		// TODO Auto-generated method stub
		this.middleLayer =MiddleLayer.getInfo();
		return this;
	}
	@Override
	public Carrols setCheese() {
		// TODO Auto-generated method stub
		this.cheese =Cheese.getInfo();
		return this;
	}
	@Override
	public Carrols setSauce() {
		// TODO Auto-generated method stub
		this.sauce =Sauce.getInfo();
		return this;
	}
	public Carrols setPatty(){
		this.patty =Patty.getInfo();	
		return this;	
	}
	
	@Override
	public Carrols setSalad() {
		// TODO Auto-generated method stub
		this.salad = Salad.getInfo();
		return this;
	}
	public Carrols( ){ 
		}
	
	
	public ArrayList <String> getBurger() {
		
	
		Burger burger= new Burger(this.topBun, this.bottomBun,this.patty,  this.middleLayer , this.salad, this.sauce, this.cheese);
		club.add(0,burger.getBottomBun());
		club.add(1,burger.getSalad());
		club.add(2,burger.getSauce());
		club.add(3,burger.getPatty());
		club.add(4,burger.getMiddleLayer());
		club.add(5,burger.getPatty());
		club.add(6,burger.getCheese());
		club.add(7,burger.getTopBun());
		return club;
	}

}
