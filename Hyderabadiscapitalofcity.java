package javapackage;


		public class Hyderabadiscapitalofcity {

			public static void main(String[] args) {
		 StringBuffer s=new StringBuffer("Hyderabad is capital of Telangana");
		 //output:"Hdabaredy is clatipa of tanagnale"
		 
		 System.out.println(s);
		 StringBuffer s1=new StringBuffer(s.substring(2,10));
		 StringBuffer s2=new StringBuffer(s.substring(13,21));
		 StringBuffer s3=new StringBuffer(s.substring(26,33));

		 s1.reverse();
		 s2.reverse();
		 s3.reverse();
		 System.out.println(s1);
		 System.out.println(s2);
		 System.out.println(s3);
		 StringBuffer n = new StringBuffer();
		 n.append("H");
		 n.append(s1);
		 n.append(" ");
		 n.append("is");
		 n.append(" ");
		 n.append("c");
		 n.append(s2);
		 n.append(" ");
		 n.append(" of");
		 n.append(" ");
		 n.append("T");
		 n.append(s3);
		 System.out.println(n);
		 
		 
			}

		

	}


