
public class GSM {
	private String model;
	private String Manufacturer;
	private double price;
	private String owner;
	Battery battery;
	Display display;

	public GSM() {
	};
	public GSM(String model) {
		this.model = model;
	};
	public GSM(String model, String manufacturer, double price, String owner, Battery battery, Display display) {
		super();
		this.model = model;
		Manufacturer = manufacturer;
		this.price = price;
		this.owner = owner;
		this.battery = battery;
		this.display = display;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return Manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Battery Getbattery() {
		return this.battery;

	}

	public void Setbattery(Battery battery) {
		this.battery = battery;
	}

	public Display Getdisplay() {
		return this.display;

	}

	public void Setdisplay(Display display) {
		this.display = display;
	}

	public String toString() {
		String temp = model + " " + Manufacturer + " " + price + " " + owner + " " + battery.Getmodel() + " "
				+ display.GetdisplaySize();
		return temp;
	}
	public static  GSM iPhone4S;
}