import java.util.Scanner;

public class Zavod1 {

	public static void main(String[] args) {
		double a;
		double b;
		double end1;
		Scanner in = new Scanner(System.in);
		System.out.println("Vid boq ");
		String color = in.nextLine();
		System.out.println("Vyvedi kakvi ekstri iskash: full, average, base ");
		String ekstra = in.nextLine();
		Zavod car = new Zavod(ekstra, color);
		Zavodtest c1 = new Zavodtest
		if(ekstra == "full"){
			a=6000;
		}if (ekstra=="average"){
			a=3010.50;
		}if (ekstra == "base"){
			a=0;
		}
		
	}

}
