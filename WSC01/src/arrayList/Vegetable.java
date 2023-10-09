package arrayList;

import java.util.ArrayList;

/*Vegetable
 * flower
 */
public class Vegetable{
	public static void main(String[] args) {
		ArrayList v =new ArrayList();
		v.add("carrot");
		v.add("beetroot");
		v.add("Brinjal");
		v.add("Cucumber");
		
		ArrayList f = new ArrayList();
		f.add("rose");
		f.add("Lilly");
		f.add("Lotus");
		
		v.addAll(f);
		
		f.add("Lilly");
		System.out.println(v);
		System.out.println(v.addAll(f));
		
		v.removeAll(f);
		System.out.println(v);
	}

}
