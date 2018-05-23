import java.util.Iterator;
import java.util.LinkedList;

public class PersoneList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Persone> list = new LinkedList<Persone>();
		Persone a=new Persone("A",32,"Burgas");
		//list.add(new Temp(7));
		list.add(new Persone("pes",13,"tt"));
		list.add(new Persone("B",45,"YY"));
		list.add(a);
		for(Persone p:list){
			System.out.println(p.getName()+" "+p.getAge()+" "+p.getAdress());
			
		}
		System.out.println();
		list.remove(1);
		for(Persone p:list){
			System.out.println(p.getName()+" "+p.getAge()+" "+p.getAdress());
			//list.remove(p);
			
		}
	}

}
