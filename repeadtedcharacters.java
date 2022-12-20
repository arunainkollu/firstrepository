package javapackage;

public class repeadtedcharacters {

	

		public static void main(String[] args) {
			String s=" Arunagowthamreddyjatinreddy";
			int count;
			
			char string[]=s.toCharArray();
			System.out.println("repeated characters in a string ");
			for(int i=0;i<s.length();i++)
			{
				count=1;
				for (int j=i+1;j<s.length();j++)
				{
					if(string[i]==string[j]&&string[i]!=0)
					
					{
						count++;
						string[j]=0;
					}
				}
				if(count>1&&string[i]!='0')
				{
					System.out.println(string[i]);
				}
			
			}

			}
}
