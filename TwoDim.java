
public class TwoDim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] rents = { {400, 450, 510},
				{500, 560, 630},
				{625, 676, 740},
				{1000, 1250, 1600},
		};
		
		for(int[] floors:rents) {
			for(int bdrm:floors) {
				System.out.println(bdrm);
			}
		}
		
		//int [] num1,num2,num3; // this is all array 
		//int nums1[], num2, num3; // first one is the array, and 2nd and 3rd are just num;

	}

}
