package Vjezbe;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long number = 4388576018402626L;
		System.out.println(number);
		
		int numberLength = 16;
		int[] nums = new int[numberLength];

		while(number > 10){
			numberLength--;
			nums[numberLength] = (int)(number % 10); 
			number = number / 10;
		}
		nums[0] = (int) number;
		
		for(int i = 0; i < nums.length; i++){
			System.out.print(nums[i] + " ");
		}
		
		System.out.println();
		for(int i = nums.length - 2; i >= 0; i-=2){
			System.out.print(nums[i] + " ");
		}
	}
}
