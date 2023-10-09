package arrayList;

import java.util.ArrayList;

public class A2 {

	public static void main(String[] args) {
		ArrayList fruits=new ArrayList();
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("banana");
		System.out.println(fruits.contains("banana"));
		System.out.println(fruits.contains("tomato"));
	}

}
