package com.vnk.LeetCode;

import java.util.Arrays;

public class LongestPrefix {
 public String prefix(String arr[]) {
	 Arrays.sort(arr);
	 int x=0;
	 String s1=arr[0];
	 String s2=arr[arr.length-1];
	 for(int i=0;i<=Math.min(s1.length()-1,s2.length()-1);i++) {
		 if(s1.charAt(i)==s2.charAt(i)) {
			 x++;
		 }else {
			 break;
		 }
	 }
	 return s1.substring(0,x);
	 }
	public static void main(String[] args) {
		LongestPrefix px=new LongestPrefix();
		System.out.println(px.prefix(new String[] {"a"}));
	}
}
