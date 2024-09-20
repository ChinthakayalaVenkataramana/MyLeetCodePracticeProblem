package com.vnk.LeetCode;

import java.util.Arrays;

public class RemoveElements {
  public int removeElements(int arr[],int val) {
	Arrays.sort(arr);
	int i=0;
	for(int j=0;j<arr.length;j++) {
		if(arr[j]!=val) {
			i++;
		}
	}
	return i;
   }
	public static void main(String[] args) {
	RemoveElements rem=new RemoveElements();
	System.out.println(rem.removeElements(new int[] {0,1,2,2,3,0,4,2}, 2));
	}
}