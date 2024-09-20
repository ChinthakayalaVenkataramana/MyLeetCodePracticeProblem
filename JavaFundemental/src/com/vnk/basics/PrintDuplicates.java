package com.vnk.basics;

public class PrintDuplicates {
  public void dupliacates(String dup) {
	for (int i=0;i<dup.length();i++) {
		int count=0;
		for(int j=0;j<i;j++) {
			if(dup.charAt(i)==dup.charAt(j)&&i!=j) {
				count++;
			}
		}
		if(count==1) {
			System.out.print(dup.charAt(i)+" ");
		}
	}
  }
	public static void main(String[] args) {
		PrintDuplicates pd=new PrintDuplicates();
		pd.dupliacates("Java Programmer");
	}
}
