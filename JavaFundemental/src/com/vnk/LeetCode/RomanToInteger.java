package com.vnk.LeetCode;

public class RomanToInteger {
	public int romanNum(String no) {
		int z=0;
		int a=0;
		/*for(int i=0;i<no.length();i++) {
			String s=""+no.charAt(i);
			int a=0;
			if(s.equals("I")) {
			 a=1;	
			}if(s.equals("V")) {
				 a=5;	
				}if(s.equals("X")) {
					 a=10;	
				}if(s.equals("L")) {
					 a=50;	
				}if(s.equals("C")) {
					 a=100;	
				}if(s.equals("D")) {
					 a=500;	
				}if(s.equals("M")) {
					 a=1000;	
				}
				
				z+=a;
		}*/
		
		for(int i=no.length()-1;i>=0;i--) {
			switch(no.charAt(i)) {
			case 'I':a=1;break;
			case 'V':a=5;break;
			case 'X':a=10;break;
			case 'L':a=50;break;
			case 'C':a=100;break;
			case 'D':a=500;break;
			case 'M':a=1000;break;
			}
			if(4*a<z) {
				System.err.println(z-=a);
			}else {
				System.out.println(z+=a);
			}
			
		}		
		return z;	
	}
	public static void main(String[] args) {
		RomanToInteger rt = new RomanToInteger();
		System.out.println(rt.romanNum("III"));
		System.out.println(rt.romanNum("MCMXCIV"));
	}

}
