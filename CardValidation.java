package Vjezbe;

public class CardValidation {

	public int[] toSingleIntegersDigits(long cardNumber) {
		int numberLength = 16;
		int[] nums = new int[numberLength];

		while(cardNumber > 10){
			numberLength--;
			nums[numberLength] = (int)(cardNumber % 10); 
			cardNumber = cardNumber / 10;
		}
		nums[0] = (int) cardNumber;
		return nums;
	}

	public int[] everySecondDigitMultiplyByTwo(long cardNumber) {
		int[] nums = toSingleIntegersDigits(cardNumber);
		int[] nums2 = new int[nums.length / 2];
		for(int i = nums.length - 2, j = 0; i >= 0; i-=2, j++){
				nums2[j] = nums[i] * 2;
				if(nums2[j] > 9)
					nums2[j] = toSingleDigit(nums2[j]);
		}
		return nums2;
	}

	private int toSingleDigit(int twoDigits) {
		int firstNum = twoDigits % 10;
		int secondNum = twoDigits / 10;
		return firstNum + secondNum;
	}

	public int sumOfSecondDigits(int[] everySecondDigit) {
		int total = 0;
		for(int i = 0; i < everySecondDigit.length; i++){
			total += everySecondDigit[i];
		}
		return total;
	}

	public boolean isValid(long cardNumber) {
		int[] numbers = toSingleIntegersDigits(cardNumber);
	if(((numbers[0] == 4 || numbers[0] == 5 || numbers[0] == 6)
			|| (numbers[0] == 3 && numbers[1] == 7))
				&& (numbers.length >= 13 && numbers.length <= 16))
		return true;
		else
			return false;
	}

	public boolean getPrefix(long cardNumber, int prefix) {
		int[] numbers = toSingleIntegersDigits(cardNumber);
		int twoNumbers = toOneValue(numbers[0], numbers[1]);
		
		if((numbers[0] == prefix || twoNumbers == prefix)
				&& (numbers.length >= 13 && numbers.length <= 16))
		return true;
		else
			return false;
	}

	private int toOneValue(int first, int second) {
		String s1 = Integer.toString(first);
		String s2 = Integer.toString(second);
		String s = s1 + s2;
		return Integer.parseInt(s);
	}

	public int getSize(long cardNumber) {
		String number = String.valueOf(cardNumber);
		return number.length();
	}
	

	public int addDigitsFromTheFirstStep(long cardNumber) {
		int[] digitsAfterFirstStep = everySecondDigitMultiplyByTwo(cardNumber);
		int total = sumOfSecondDigits(digitsAfterFirstStep);
		return total;
	}

	public int addOddDigitsFromRight(long cardNumber) {
		int[] digits = toSingleIntegersDigits(cardNumber);
		int total = 0;
		for(int i = digits.length - 1; i >= 0; i-=2){
			total += digits[i];
		}
		return total;
	}

	public boolean validCardNumber(long cardNumber) {
		boolean divisibleBy10 = false;
		int sumOfTwoSteps = addDigitsFromTheFirstStep(cardNumber) + addOddDigitsFromRight(cardNumber);
		if(sumOfTwoSteps % 10 == 0)
			divisibleBy10 = true;
		return divisibleBy10;
		}
}
