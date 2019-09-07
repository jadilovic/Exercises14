package Vjezbe;

import java.util.ArrayList;
import java.util.Scanner;

public class Text {
	
	//Scanner input = new Scanner(System.in);
	//String word = input.next();
	

	public boolean isString(String input) {
		if(input.isEmpty() || input == null)
		return false;
		else
			return true;
	}

	public int getLength(String input) {
		// TODO Auto-generated method stub
		return input.length();
	}

	public String charsAtEvensOrOdds(String input, boolean even) {
		StringBuilder bildE = new StringBuilder(input.length());
		StringBuilder bildO = new StringBuilder(input.length());
		
		char [] c = input.toCharArray();
		for(int i = 0; i < c.length; i++){
			if((i + 1) % 2 == 0){
				bildE.append(c[i]);
			}
			else
				bildO.append(c[i]);
		}
		
		if(even)
		return bildE.toString();
		else
			return bildO.toString();
	}

	public int numberUpperAndLowerCase(String input, String letter) {
		int countU = 0;
		int countL = 0;
		int countO = 0;
		char [] c = input.toCharArray();
		for(int i = 0; i < c.length; i++){
			if(Character.isUpperCase(c[i])){
				countU++;
			}
			else if(Character.isLowerCase(c[i]))
				countL++;
			else{
				if(!Character.isWhitespace(c[i]))
				countO++;
			}
		}
		if(letter.equals("upper"))
			return countU;
		else if(letter.equals("lower"))
			return countL;
		else
			return countO;
	}

//	public String charsAtOdd(String input) {
//		StringBuilder bild = new StringBuilder(input.length());
//		char [] c = input.toCharArray();
//		for(int i = 0; i < c.length; i++){
//			if((i + 1) % 2 != 0){
//				bild.append(c[i]);
//			}
//		}
//		return bild.toString();
//	}
}