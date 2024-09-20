package com.vnk.LeetCode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeSortedArray {
	 public void merge(int[] nums1, int m, int[] nums2, int n) {
			/*int[] arr=IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2)).toArray();
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));*/
		 for(int i=0,j=m;i<n;i++) {
			 nums1[j]=nums2[i];
			 j++;
		 }
		 Arrays.sort(nums1);
		 System.out.println(Arrays.toString(nums1));
	 }
	public static void main(String[] args) {
		MergeSortedArray msa=new MergeSortedArray();
		msa.merge(new int[] {1,2,3,0,0,0},3, new int[] {2,5,6}, 3);

	}

}
