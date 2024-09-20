package com.vnk.LeetCode;

public class Sqrtx {
 public static int squerRoot(int x) {
	 if(x==0||x==1)return x;
	 
	 int s=1;
	 int l=x;
	 int m=-1;
	 while(s<=x) {
		m=s+(l-s)/2;
		 if(m*m > x)
			l=m-1; 
		 else if(m*m==x)
			 return m;
		 else
			 s=m+1;
			 
	 }
	return Math.round(l);
 }
	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println(Sqrtx.squerRoot(8));
	}
}
