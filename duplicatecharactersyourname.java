package javapackage;

public class duplicatecharactersyourname {

	public static void main(String[] args) {
		     
		    {  
		        String str = "ARUNA GOWTHAM REDDY JATINREDDY";  
		        int count;  
		          
		        //Converts given string into character array  
		        char[] string1 = str.toCharArray();  
		          
		        System.out.println("Duplicate characters in a given string: ");  
		        //Counts each character present in the string  
		        for(int i = 0; i <string1.length; i++) {  
		            count = 1;  
		            for(int j = i+1; j <string1.length; j++) {  
		                if(string1[i] == string1[j] && string1[i] != ' ') {  
		                    count++;  
		                    //Set string1[j] to 0 to avoid printing visited character  
		                    string1[j] = '0';  
		                }  
		            }  
		            //A character is considered as duplicate if count is greater than 1  
		            if(count > 1 && string1[i] != '0')  
		            	 System.out.println(string1[i]);  
		        }  
	}

}
}