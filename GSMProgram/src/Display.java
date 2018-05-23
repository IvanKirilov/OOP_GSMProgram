
public class Display {
	private int displaySize;
	private int colorsNumber;

	public Display() {
	};

	public Display(int displaySize, int colorsNumber) {
		this.displaySize = displaySize;
		this.colorsNumber = colorsNumber;
	};

	public int GetdisplaySize() {
		return this.displaySize;
	};

	public void SetdisplaySize(int displaySize) {
		this.displaySize = displaySize;
	};

	public int GetcolorsNumber() {
		return this.colorsNumber;
	};

	public void SetcolorsNumber(int colorsNumber) {
		this.colorsNumber = colorsNumber;
	};
}