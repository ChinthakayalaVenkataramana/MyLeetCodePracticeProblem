package com.vnk.basics;

public class RemoveDuplicates {
  public String duplicate(String dup) {
	  String str="";
	  for(int i=0;i<dup.length();i++) {
		  int count=0;
		  if(dup.charAt(i)!=' ') {
			  for(int j=0;j<dup.length();j++) {
				  if(dup.charAt(i)==dup.charAt(j)&&i!=j) {
				   count++;	 
				   break;
				  }
			   }
			  if(count==0) {
				  str+=dup.charAt(i);
				  break;
			  }
		  }
	  }
	  return str;
  }
	public static void main(String[] args) {
		RemoveDuplicates rd=new RemoveDuplicates();
		System.out.println(rd.duplicate("aaHello"));
	}
}
