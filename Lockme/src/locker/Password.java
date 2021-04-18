package locker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Password {
	
	private int option;
	private int tamanho = 10;
	private String password = "";
	private Random nAleatorio = new Random();
	private List<String> list = new ArrayList<String>();
	private String[] numbers = {
			"0","1","2","3","4","5","6","7","8","9"};
	private String[] words = {
			"a","b","c","d","e","f","g","h","i","j",
			"k","l","m","n","o","p","q","r","s","t",
			"u","v","w","y","x","z"};
	private String[] especials = {
			"a","b","c","d","e","f","g","h","i","j",
			"k","l","m","n","o","p","q","r","s","t",
			"u","v","w","y","x","z","!","@","#","$",
			"%","&","*","(",")","-","+","-","/","|"};
	private String[] fuckAll = {
			"a","b","c","d","e","f","g","h","i","j",
			"k","l","m","n","o","p","q","r","s","t",
			"u","v","w","y","x","z","!","@","#","$",
			"%","&","*","(",")","-","+","-","/","|",
			"0","1","2","3","4","5","6","7","8","9"
	};
	
	public void setPassword(int length) {
		this.tamanho = length;
		this.password = "";
		
		
		switch (option) {
		
		case 1: 
			list.clear();
			for(int i=0; i < numbers.length; i++) {
			list.add(numbers[i]);
		} break;
		case 2:
			list.clear();
			for(int i=0; i < words.length; i++) {
			list.add(words[i]);
		} break;
		case 3:
			list.clear();
			for(int i=0; i < especials.length; i++) {
				list.add(especials[i]);
			} break;
		case 4: 
			list.clear();
			for(int i=0; i < fuckAll.length; i++) {
				list.add(fuckAll[i]);
			}break;
		}
		
		for(int i=0; i < this.tamanho; i++) {
			this.password += list.get(nAleatorio.nextInt(list.size()));
		}
		
		
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setOption(int option) {
		this.option = option;
	}
	
	public int getOption() {
		return this.option;
	}
	
	
	
}
