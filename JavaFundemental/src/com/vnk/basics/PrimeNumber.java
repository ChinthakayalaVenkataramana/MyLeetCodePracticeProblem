package com.vnk.basics;

import java.util.Scanner;

public class PrimeNumber {
  public void primeno(int prim) {
	  
	  for(int i=10;i<=prim;i++) {
		  int count =0;
		  if(i==0||i==1)continue;
		  for(int j=2;j<=i/2;j++){
			 if(i%j==0) {
				 count++;
				 break;
			 }
		  }
		  if(count ==0) {
			  System.out.print(i+" ");
		  }
	  }
	  
	  
	  
	/*int count =0;
	 for(int i=1;i<prim;i++ ) {
	  if(prim%i==0) {
		  count++;
	  }
	 }
	 if(count ==1) {
	  System.out.println("Prime number");
	 }else{
	  System.out.println("Not Prime Number");
	 }*/
	}
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		PrimeNumber pn=new PrimeNumber();
		System.out.println("Enter Numnber");
		int no=Sc.nextInt();
		pn.primeno(no);
		System.out.println();
        Sc.close();
	}
}
