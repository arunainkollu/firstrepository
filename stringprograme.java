package javapackage;

public class stringprograme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Welcome to java";
		String s2="Welcome to java";
		String s3=new String("selenium");
		String s4=new String("selenium");
		
		System.out.println("No of char in s1:"+s1.length());
		System.out.println(s1.concat(s2));
		System.out.println(s1+s2);
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println("--------------");
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		System.out.println("******************************");
		String s5="Selenium";
		String s6="Welcome to";
		System.out.println(s5.equalsIgnoreCase(s6));
		System.out.println(s1.compareTo(s6));
		System.out.println(s1.contains(s3));
		System.out.println(s1.charAt(5));
		System.out.println(s1.substring(8));
		System.out.println(s1.substring(0,7));

	}


		}


	


	


