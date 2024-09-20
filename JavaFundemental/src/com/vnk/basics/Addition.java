package com.vnk.basics;
import java.util.Arrays;
public class Addition {

	public static void main(String[] args) {
		
		/*System.out.println(Arrays.toString(args));
		System.out.println(args[0]);*/
		
		/*int x=10;
		int y=90;
		System.out.println(+x+y);*/
		
		/*int x=10;
		int y=90;
		System.out.println("Sum = "+x+y);
		System.out.println("Sum = "+(x+y));*/
		
		/*int sum=Calculate.sum(25,67);
		int squere=Calculate.squere(5);
		int cube=Calculate.cube(4);
		System.out.println("sum : "+sum+System.lineSeparator()+"squere : "+squere+System.lineSeparator()+"cube : "+cube);*/
		
       int x=0Xabcdef59;
       int b=0b11;//Binary
       System.out.println(b);
	}

}
class Calculate{
	public static int sum(int x,int y) {
		return x+y;
	}
	public static int squere(int x) {
		return x*x;
	}
	public static int cube(int x) {
		System.out.println(Math.abs(x));
		return x*x*x;
	}
}
