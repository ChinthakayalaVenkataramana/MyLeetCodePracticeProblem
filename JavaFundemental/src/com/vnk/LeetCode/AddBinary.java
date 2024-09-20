package com.vnk.LeetCode;

public class AddBinary {
	public String binary(String s1,String s2) {
		StringBuilder sb=new StringBuilder();
		int x=0;
		int str1=s1.length()-1;
		int str2=s2.length()-1;
		while(str1>=0||str2>=0||x==1) {
			if(str1>=0) 
				x+=s1.charAt(str1--)-'0';
			if(str2>=0)	
				x+=s2.charAt(str2--)-'0';
			sb.append(x%2);
			x/=2;
		}
		return sb.reverse().toString();
	}
public static void main(String[] args) {
    AddBinary ad=new AddBinary();	
    System.out.println(ad.binary("1466","1"));
 }
}
