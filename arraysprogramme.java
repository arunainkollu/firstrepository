package javapackage;

import java.util.Arrays;

public class arraysprogramme {

	public static void main(String[] args) {


					
					int a[]= {3,5,1,4,2};
					int b[]=new int[5];
					System.out.println("No of elements in a: "+a.length);
					System.out.println("4th element in a: "+a[3]);
					System.out.println("No of elements in b: "+b.length);
					b[2]=100;
					System.out.println("4th element in b: "+b[3]);
					System.out.println(Arrays.equals(a, b));
					System.out.println("2nd element before sort:"+a[1]);
					Arrays.sort(a);
					System.out.println("2nd element after sort:"+a[1]);

				}
			

	}


