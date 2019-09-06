package Vjezbe;

import java.util.Scanner;

public class LafoLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter username: ");
		String userName = enterText();
		System.out.println("Please enter password");
		String passWord = enterText();
		
		System.out.println("Username is " + userName + " is null " + isNull(passWord));
	}

	public static String enterText() {
		Scanner input = new Scanner(System.in);
		return input.next();
	}

	public static boolean isNull(String input) {
		if(input == null)
			return false;
		return true;
	}

	public boolean isEmptyString(String input) {
		if(input == "")
		return false;
		return true;
	}

	public boolean isShorter10(String input) {
		if(input.length() < 10)
			return true;
		return false;
	}

}
