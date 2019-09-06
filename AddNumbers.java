package Vjezbe;

public class AddNumbers {
	
	private int num1;
	private int num2;
	
	public AddNumbers() {
		num1 = 0;
		num2 = 0;
	}

	public AddNumbers(int i, int j) {
		num1 = i;
		num2 = j;
	}

	public int adding(int i, int j) {
		// TODO Auto-generated method stub
		return i + j;
	}

	public int subtract(int i, int j) {
		if(i < j)
			throw new IllegalArgumentException();
		return i - j;
	}

	public int divide(int i, int j) {
		// TODO Auto-generated method stub
		return i / j;
	}

	public int multiply(int i, int j) {
		// TODO Auto-generated method stub
		return i * j;
	}

	
}
