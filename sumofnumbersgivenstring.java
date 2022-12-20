package javapackage;

public class sumofnumbersgivenstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "selenium 1234 is web automation 4567 tools";

		int sum= 0;
       //System.out.println(s.length());
		for(int i = 0;  i< s.length(); i++) {
		    if(Character.isDigit(s.charAt(i))) {
		 sum= sum+ Integer.parseInt(s.charAt(i) + "");
		   
		    } 
		

		System.out.println(sum);
	}

	}
	


	}


