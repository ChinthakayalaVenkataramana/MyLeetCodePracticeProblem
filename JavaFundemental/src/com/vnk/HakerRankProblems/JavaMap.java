package com.vnk.HakerRankProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		sc.nextLine();
		Map<String,Integer> map=new HashMap<>();
		for(int i=0;i<x;i++) {
			String key=sc.nextLine();
			int value=sc.nextInt();
			sc.nextLine();
			map.put(key,value);
		}
		
		while(sc.hasNext()) {
			String key=sc.nextLine();
			if(map.containsKey(key)) {
				System.out.println(key+"  "+map.get(key));
			}else {
				System.out.println("Not Found");
			}
		}
		sc.close();
	}

}
