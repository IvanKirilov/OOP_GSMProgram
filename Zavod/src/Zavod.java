
public class Zavod {
	public String color;
	public final double price=35100.65;
	public final double end = 20;
	public String ekstra;
	
	public Zavod(String Color,String ekstra ){
		this.color = color;
		this.ekstra = ekstra;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getEkstra() {
		return ekstra;
	}

	public void setEkstra(String ekstra) {
		this.ekstra = ekstra;
	}

	public double getPrice() {
		return price;
	}

	public double getEnd() {
		return end;
	}
	
	
	

}
