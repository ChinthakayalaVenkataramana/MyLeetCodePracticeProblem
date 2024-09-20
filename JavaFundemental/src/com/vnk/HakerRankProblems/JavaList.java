package com.vnk.HakerRankProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
	  public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	      List<Integer> list=new ArrayList<>();
	      System.out.println("enter 5");
	      int x=sc.nextInt();
	      for(int i=0;i<x;i++){
	    	System.out.println("Enter Value");
	        int num=sc.nextInt();
	        list.add(num);  
	      }
	      
	      System.out.println("Enter 2");
	      int y=sc.nextInt();
	      sc.nextLine();
	      for(int j=0;j<y;j++){
	    	  System.out.println("Enter Option 1 Inser/Delete");
	          String str=sc.nextLine();
	          if(str.equalsIgnoreCase("Insert")){
	        	 System.out.println("index ,num");
	             int m=sc.nextInt();
	             int m1=sc.nextInt();
	             sc.nextLine();
	             list.add(m,m1);   
	          }else if(str.equals("Delete")){
	        	  System.out.println("Enter index");
	              int n=sc.nextInt();
	              list.remove(n);
	          }
	      }
	      
	      for(int cv:list) {
	    	  System.out.print(cv+" ");
	      }
	 }
}
