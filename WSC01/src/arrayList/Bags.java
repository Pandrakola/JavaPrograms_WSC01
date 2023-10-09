package arrayList;

import java.util.ArrayList;

public class Bags {

	public static void main(String[] args) {
		ArrayList bags=new ArrayList();
		bags.add("WildCraft");
		bags.add("American Tourist");
		bags.add("HRX");
		
		for(Object o:bags) {
			System.out.println(o);
		}

	}

}
