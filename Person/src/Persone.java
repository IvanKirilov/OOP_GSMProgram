
public class Persone {
	String name;
	int age;
	String adress;
	public Persone(String name, int age, String adress) {
		super();
		this.name = name;
		this.age = age;
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Persone [name=" + name + ", age=" + age + ", adress=" + adress + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}

}