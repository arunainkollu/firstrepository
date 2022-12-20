package javapackage;

import java.util.Arrays;

public class highestnumberinarray {

	public static void main(String[] args) {
		int a[]= {1,24,56,98,345,679,1000};
		 int Largest=a[0];
		 int Smallest=a[0];

		 for(int i=0;i<a.length;i++) {
			
		 if(a[i] >Largest) {
				Smallest =a[i];
			
			}
			if(a[i]<Largest) {
				Largest =a[i];
			}
			
			}
			System.out.println("\n given array is:"+Arrays.toString(a));
			System.out.println("Largest a is::"+Largest);
			System.out.println("Smallest a is::"+Smallest);


		}
		

	}


