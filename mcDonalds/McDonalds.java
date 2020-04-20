package mcDonalds;
import builder.*;

public class McDonalds extends BurgerBuilder {
		
		private StringBuilder BigMac;
	

		private String topBun="";
		private String bottomBun="";
		private String patty="";
		private String middleLayer="";
		private String sauce="";
		private String salad="";
		private String cheese="";



		public McDonalds setTopBun() {
			this.topBun ="Sesame seed bun top slice";
			return this;
		}

		

		public McDonalds setBottomBun() {
			this.bottomBun = "Sesame seed  bun bottom slice";
			return this;
		}

		
		public McDonalds setPatty() {
			this.patty = "Spiced ground beef patty";
			return this;
		}

		

		public McDonalds setMiddleLayer() {
			this.middleLayer = "Sesame seed bun middle slice";
			return this;
		}

		

		public McDonalds setSauce() {
			this.sauce = "Thousand Islands sauce";
			return this;
		}

		

		public McDonalds setSalad() {
			this.salad = "Sliced Iceberg lettuce";
			return this;
		}

		

		public McDonalds setCheese() {
			this.cheese = "a slice of Cheddar";
			return this;
		}

		
		
		public McDonalds( ){ 
			
			this.BigMac = new StringBuilder();
			}
		
		public StringBuilder getBurger() {
			Burger burger = new Burger(this.topBun, this.bottomBun, this.patty, this.middleLayer, this.sauce, this.salad, this.cheese);
			//System.out.println(burger.getTopBun());
			BigMac.append(burger.getBottomBun() + "\n");
			BigMac.append(burger.getSalad() + "\n");
			BigMac.append(burger.getSauce() + "\n");
			BigMac.append(burger.getPatty() + "\n");
			BigMac.append(burger.getMiddleLayer() + "\n");
			BigMac.append(burger.getPatty() + "\n");
			BigMac.append(burger.getCheese() + "\n");
			BigMac.append(burger.getTopBun() + "\n");
			
			return BigMac;
		}
		
		
	}
