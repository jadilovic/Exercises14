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

	public String charsAtEvens(String input) {
		ArrayList<Character> ch = new ArrayList<>();
		char [] c = input.toCharArray();
		for(int i = 0; i < c.length; i++){
			if((i + 1) % 2 == 0){
				ch.add(c[i]);
			}
		}
		String evenChars = getString(ch);
		return evenChars;
	}

	private String getString(ArrayList<Character> ch) {
		StringBuilder bild = new StringBuilder(ch.size());
		for(Character c: ch){
			bild.append(c);
		}
		return bild.toString();
	}
}