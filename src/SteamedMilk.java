
public class SteamedMilk extends CondimentDecorator {

	Beverage beverage;

	public SteamedMilk(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Steamed Milk";
	}

	
	public double cost() {
		// TODO Auto-generated method stub
		return .10 + beverage.cost();
	}
}