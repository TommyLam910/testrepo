import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names = new ArrayList<String>();
		
		ArrayList aList = new ArrayList();
		aList.add(1);
		aList.add(10.4);
		aList.add("Anu");
		
		System.out.println(aList);
		for(Object val:aList) {
			System.out.println(val);
		}
		
		
		names.add("Christy");
		names.add("John");
		names.add("Anu");
		names.add("Leo");
		
		System.out.println(names);
		names.remove(1);
		System.out.println(names);
		System.out.println("The size of the arraylist " + names.size());
		System.out.println("The element of arraylist at 2 " + names.get(2));
	}

}
