
public abstract class Jet extends AirField {
	private String model;
	private double speed;
	private int range;
	private long price;

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

	public String jets(String model, double speed, int range, long price) {
		String jet = null;

		return jet;
	}

	public void fly() {

	}
	
	public double getSpeedInMach() {
		double speed = 0;
		
		return speed;
	}

//	jets[0] = "B-2 Spirit";
//	jets[1] = "F-117 NightHawk";
//	jets[2] = "F-35 Lightning";
//	
}