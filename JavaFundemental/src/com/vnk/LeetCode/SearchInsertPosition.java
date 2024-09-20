package com.vnk.LeetCode;

public class SearchInsertPosition {
	static public int position(int [] arr,int target) {
		int count=0;
	     for(int i=0;i<arr.length;i++) {
	    	 if(arr[i]==target) {
	    		 return i;
	    	 }else if(arr[i]<target){
	    		 count++;
	    	 }
	     }
		return count;
	}
   public static void main(String[] args) {
	System.out.println(SearchInsertPosition.position(new int[] {1,3,5,6}, 7));
   }
}
