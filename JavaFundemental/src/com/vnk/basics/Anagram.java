package com.vnk.basics;

import java.util.Arrays;

public class Anagram {
	public String anagram(String str1,String str2) {
		char[] a=str1.toCharArray();
		char[] b=str2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		System.err.println(Arrays.toString(a)+"    "+Arrays.toString(b));
		if(a.length!=b.length) {
			return "Not Anagram";
		}else {
		for(int i=0;i<a.length;i++) {
			if(a[i]==b[i]) {
				
			}else {
				return "Not Anagram";
			}
		 }
		}
		return "Anagram";
	}
	public static void main(String[] args) {
		Anagram a=new Anagram();
		System.out.println(a.anagram("many", "mayn"));
	}
}
