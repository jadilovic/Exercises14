package Vjezbe;

import java.util.Scanner;

public class testCardValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a credit card number as a long integer");
		long cardNumber = input.nextLong();
		CardValidation cv = new CardValidation();
		boolean validCardNumber = cv.validCardNumber(cardNumber);
		if(validCardNumber){
			System.out.println(cardNumber + " is valid");
		}
		else
			System.out.println(cardNumber + " is INvalid");
		input.close();
	}
}
