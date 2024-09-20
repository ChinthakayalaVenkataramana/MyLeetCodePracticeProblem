package com.vnk.LeetCode;

public class NumberPolindrome {
	public boolean polindrome(int x) {
		int  a=x;
		int b=0;
		while(1<=x) {
			int c=x%10;
			b=(b*10)+c;
			x/=10;
		}
		if(b==a) {
			System.out.println("Polindrome Number..");
		return true;
		}else {
			System.out.println("Not Polindrome Number..");
			return false;
		}
		
	}
	public static void main(String[] args) {
		NumberPolindrome np=new NumberPolindrome();
		System.out.println(np.polindrome(1321));		
	}
}
