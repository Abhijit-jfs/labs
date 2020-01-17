package com.abhijit.moviestore;

import java.util.ArrayList;

class Fruit {
	
}

public class Apple extends Fruit {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("hello");
		a.add("abhijit");
		//a.add(4.0);
		
		for (Object x : a) {
			System.out.println(x.getClass().getSimpleName());
		}
		
		
		Fruit f = new Apple();
		Apple cas = (Apple) f;
	}
}
