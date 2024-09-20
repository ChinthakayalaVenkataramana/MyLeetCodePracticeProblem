package com.vnk.LeetCode;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
	    public int removeDuplicates(int[] nums) {
	    	Arrays.sort(nums);
	    	int i=0;
	    	for(int j=0;j<nums.length;j++) {
	    		if(nums[i]!=nums[j]) {
	    			i++;
	    			nums[i]=nums[j];
	    		}
	    	}
	    	return i+1;
	    }
   public static void main(String[] args) {
		RemoveDuplicatesFromSortedArray rem=new RemoveDuplicatesFromSortedArray();
		System.out.println(rem.removeDuplicates(new int[] {1,1,2}));
	}
}
