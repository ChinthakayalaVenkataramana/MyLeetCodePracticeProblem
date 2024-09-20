package com.vnk.HakerRankProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class JavaHashSet {

	public static void main(String[] args)throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a Numnber....");
		int num=Integer.parseInt(bf.readLine());
		String[] left=new String[num];
		String[] right=new String[num];
		for(int i=0;i<num;i++) {
			System.out.println("Enter key:");
			String str1=bf.readLine();
			left[i]=str1;
			System.out.println("Enter value");
			String str2=bf.readLine();
			right[i]=str2;
		}
		Set<String> set=new HashSet<>();
		for(int i=0;i<left.length;i++) {
			set.add(left[i]+"."+right[i]);
			System.out.println(set.size());
		}
	}
}
