package builder;
import mcDonalds.*;

public class Burger {

	private String topBun="";
	private String bottomBun="";
	private String patty="";
	private String middlelayer="";
	private String sauce="";
	private String salad="";
	private String cheese="";
	
	
	public Burger(String topBun, String bottomBun, String patty, String middlelayer, String sauce, String salad, String cheese ) {
		this.topBun=topBun;
		this.bottomBun =bottomBun;
		this.patty = patty;
		this.middlelayer =middlelayer;
		this.sauce =sauce;
		this.salad = salad;
		this.cheese = cheese;
		
	
	}
	
	public String getTopBun() {
		return this.topBun;
	}
	public String getBottomBun() {
		return this.bottomBun;
	}
	public String getPatty() {
		return this.patty;
	}
	public String getMiddleLayer() {
		return this.middlelayer;
	}
	public String getSauce() {
		return this.sauce;
		
	}public String getSalad() {
		return this.salad;
		
	}public String getCheese() {
		return this.cheese;
	}
	



	
}
