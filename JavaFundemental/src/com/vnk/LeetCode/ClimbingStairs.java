package com.vnk.LeetCode;

public class ClimbingStairs {
   public static int stairs(int x) {
		int[]arr=new int[x+1];
		arr[0]=1;
		arr[1]=2;
		for(int i=2;i<x;i++) {
			arr[i]=arr[i-1]+arr[i-2];
			//System.out.print(arr[i]+" ");
		}
		return arr[x-1];
   }
	public static void main(String[] args) {
		System.out.println(ClimbingStairs.stairs(8));
	}

}
