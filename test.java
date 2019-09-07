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
		
		for(int i = 0; i < nums.length; i++){
			System.out.print(nums[i] + " ");
		}
		System.out.println(number);
	}

}
