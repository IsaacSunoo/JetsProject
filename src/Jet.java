
public abstract class Jet {
	private String model;
	private double speed;
	private int range;
	private long price;

	public Jet(String model, double speed, int range, long price) {
		setModel(model);
		setSpeed(speed);
		setRange(range);
		setPrice(price);
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Jet model: " + model + ", speed: " + speed + ", range: " + range + ", price: " + price ;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}


	public void fly() {
		System.out.println(getModel() + " takes flight!");

	}
	
	public double getSpeedInMach() {
		double speed = 0;
		
		return speed;
	}

}