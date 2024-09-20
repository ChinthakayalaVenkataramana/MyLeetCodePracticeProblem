package com.vnk.LeetCode;

import java.util.Arrays;

public class TwoSum {
	public int[] sum(int arr[],int target) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					return new int[] {i,j};
				}
			}
		}
		return new int [] {};
	}

	public static void main(String[] args) {
		TwoSum ts=new TwoSum();
	    System.out.println(Arrays.toString(ts.sum(new int[] {12,23,56,26,8,9,6,5,3,5,21,13},25)));
	}
}
