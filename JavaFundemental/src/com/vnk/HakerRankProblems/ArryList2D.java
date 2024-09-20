package com.vnk.HakerRankProblems;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class ArryList2D {

	public static void main(String[] args)throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many rows are Created : ");
		int x=sc.nextInt();
		List<List<Integer>>list=new ArrayList<>();
		for(int i=1;i<=x;i++) {
			System.out.println("How many columns are Created : ");
			int y=sc.nextInt();
			ArrayList<Integer> arr=new ArrayList<>();
			for(int j=1;j<=y;j++) {
				arr.add(sc.nextInt());
			}
			list.add(arr);
		}
		
		int a=sc.nextInt();
		for(int i=0;i<a;i++) {
			int b=sc.nextInt();
			int c=sc.nextInt();
			try {
		    System.out.println(list.get(b-1).get(c-1));
			}catch(Exception e) {
				System.out.println("ERROR !");
			}
		}
		sc.close();
	}
}
