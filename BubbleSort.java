public class BubbleSort {

	public static void main(String[] args) {
		int [] nums = {4,6,1,2,9,22};
		
		for(int num:nums) {
			System.out.print(num + "\s");
		}
		
		System.out.println();
		System.out.println("After sorting");
		
		
		for (int i=0 ; i<nums.length; i++) {
			for (int j = 0; j < nums.length - 1; j++) {
				if(nums[j] > nums[i]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		
		
		for(int num:nums) {
			System.out.print(num + "\s");
		}
		
	}
}
