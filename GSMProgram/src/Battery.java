
public class Battery {
	private String model;
	private double hoursIdle;
	private double hoursTalk;

	public Battery() {
	};

	public Battery(String model, double hoursIdle, double hoursTalk) {
		this.model = model;
		this.hoursIdle = hoursIdle;
		this.hoursTalk = hoursTalk;
	};

	public String Getmodel() {
		return this.model;
	};

	public void Setmodel(String model) {
		this.model = model;
	};

	public double hoursIdle() {
		return this.hoursIdle;
	};

	public void hoursIdle(double hoursIdle) {
		this.hoursIdle = hoursIdle;
	};

	public double hoursTalk() {
		return this.hoursTalk;
	};

	public void hoursTalk(double hoursTalk) {
		this.hoursTalk = hoursTalk;
	};
}
