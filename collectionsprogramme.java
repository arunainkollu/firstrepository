package javapackage;

import java.util.ArrayList;
import java.util.Collections;

public class  collectionsprogramme {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		ArrayList<String> al2=new ArrayList<String>();
        al.add("gowtham");   
		al.add("amma");//removeAll()
		al.add("raji");//isEmpty()
		al.add("aruna");//retainAll()
	    al2.add("amma");//clear()
		al2.add("raji");//iterator()
		al2.add("aruna");
		System.out.println(al.equals(al2));
        System.out.println(al.contains(al2));
         System.out.println(al.containsAll(al2));
		System.out.println("Before sort:"+al);
		Collections.sort(al);
		System.out.println("After sort:"+al);
		Collections.reverse(al);
		System.out.println("No of elements:"+ al.size());
		System.out.println("No of elements:"+ al2.size());

		
		}
		
	
	}


		