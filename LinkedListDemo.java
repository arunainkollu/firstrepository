package javapackage;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> al=new LinkedList<String>();
		al.add("Aruna");
		al.add("Bharghavi");
		al.add("Chiranjivi");
		al.add("Anita");
		al.set(1,"Durga");
		//al.remove(2);
		System.out.println("No of elements:"+al.size());
		for(String s:al)
		{
			System.out.println(s);
		}

	}

}