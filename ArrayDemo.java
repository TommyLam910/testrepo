
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This is to declare the sales size with 10 empty value
		final int SIZE = 10;
		double [] sales; // no memory is allocated
		sales = new double[SIZE];
		
		sales[0] = 10;
		
		for(int i = 0; i < sales.length; i++) {
			System.out.println(sales[i]);
		}
		
		//Initialization list
		
		int[] numbers = {3,5,6,8,9,0};
		//enhanced for loop
		
		//for (type num:nameOfArray)
		for(int num:numbers) {
			System.out.print(num + "\s");
		}
		
		String[] strings = {"Java", "JavaScript", "C#", "Python"};
		for (String value:strings) {
			System.out.print(value + "\s");
		}
	}

}
