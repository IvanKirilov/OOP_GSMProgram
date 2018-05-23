
public class GSMTest {
	public GSM g;

	public boolean getModelTest(String output) {
		if (g.getModel().equals(output))
			return true;
		return false;
	}
	public boolean setModelTest(String output) {
		if (g.getModel().equals(output))
			return true;
		return false;
	}
}