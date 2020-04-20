package builder;

public abstract class BurgerBuilder {
	protected Burger burger;
	

	public abstract BurgerBuilder setTopBun();
	public abstract BurgerBuilder setBottomBun();
	public abstract BurgerBuilder setMiddleLayer();
	public abstract BurgerBuilder setCheese();
	public abstract BurgerBuilder setSauce();
	public abstract BurgerBuilder setSalad();
	public abstract BurgerBuilder setPatty();
}
