package com.vnk.basics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringPolindrome {
  public String polindrome(String str) {
	  String s1=str,s2="";
	  for(int i=str.length()-1;i>=0;i--) {
		  s2+=str.charAt(i);
	  }
	  //System.out.println(s1+"   "+s2);
	  if(s1.equals(s2)) {
		  return s1+" Is Polindrome";
	  }else {
		  return s1+" Not polindrome";
	  } 
  }
	public static void main(String[] args)throws IOException{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a String : ");
		String poly=bf.readLine();
		StringPolindrome strpoly=new StringPolindrome();
		System.out.println(strpoly.polindrome(poly));
		
		
		
		// --- Line Separator ---
		
		/*System.out.print("Hello"+System.lineSeparator()+"Good Morning");
		System.out.print("Hello\nGood");
		System.out.printf("Hello%nGood");
		System.out.println("Hello"+System.getProperty("line.separator")+"Good");*/
		
	}
}
