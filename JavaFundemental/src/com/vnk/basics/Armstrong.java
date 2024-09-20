package com.vnk.basics;
public class Armstrong {
	public String armstrong(int num) {
		int a=num;
		int b=0;
		String l=""+num;
		for(int i=1;i<=num;) {
			int c=num%10;
			b=b+(int)Math.pow(c,l.length());
			num/=10;
		}
		if(a==b)
		return a+" is Armstong "+b;
		else
			return a+" Not Armstrong "+b;
	 }
	public static void main(String[] args) {
		Armstrong a=new Armstrong();
		// 153,1634,371.370,407
		System.out.println(a.armstrong(379));
	}
}
