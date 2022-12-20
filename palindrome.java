package javapackage;

public class palindrome {

	public static void main(String[] args) {
		
          String str1 = "madam";
		StringBuffer sb= new StringBuffer(str1);
		sb.reverse();
		String str2 = sb.toString();
		if(str1.equals(str2)){
	         System.out.println("Given String is palindrome");
	      } else {
	         System.out.println("Given String is not palindrome");
	          
	      }	  }		  
						       

	}

		
