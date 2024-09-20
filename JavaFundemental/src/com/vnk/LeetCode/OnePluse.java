package com.vnk.LeetCode;

import java.util.Arrays;

public class OnePluse {
   public int[] onePluse(int[] arr) {
	   for(int i=arr.length-1;i>=0;i--) {
		   if(arr[i]<9) {
	         arr[i]++;
	         return arr;
		   }else {
			   arr[i]=0;
		   }
	   }
	   arr=new int[arr.length+1];
	   arr[arr.length-2]=1;
	   return arr;
   }
	public static void main(String[] args) {
    OnePluse op=new OnePluse();
    System.out.println(Arrays.toString(op.onePluse(new int[] {9,8,9})));
	}
}
