package javapackage;

import java.util.ArrayList;
import java.util.Collections;

class movie
{
	String moviename;
	int remunaration;
	int year;
	
	movie(String moviename,int remunaration,int year)
{
	this.moviename=moviename;
	this.remunaration=remunaration;
	this.year=year;
}
}

public class moviedatails {

	public static void main(String[] args) {
		ArrayList<movie> al=new ArrayList<movie>();
		al.add(new movie(" rrr",100000,2022));
		al.add(new movie(" annayya",150000,2021));
		al.add(new movie(" ready",180000,2020));
		al.add(new movie(" challenge",20000,2022));
		al.add(new movie(" kantara",1000,2022));
		System.out.println("before sort");
		al.forEach(l->System.out.println(l.moviename+" "+l.remunaration+" "+l.year));
		
		Collections.sort(al,(p1,p2)-> {
			return p1.moviename.compareTo(p2.moviename);
			
		});
		System.out.println("********* After sort **********");	
		al.forEach(l -> System.out.println(l.moviename+" "+l.remunaration+" "+l.year));	

	}

}
 