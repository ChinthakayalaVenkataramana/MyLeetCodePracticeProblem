package com.vnk.LeetCode;
public class FindTheClosestNumberToZero {

	public int closestNumber(int[] no) {
		int small=no[0];
		for(int i=1;i<no.length;i++) {
			if(Math.abs(small)==no[i]) {
				small=no[i];
			}
			if(Math.abs(no[i])<Math.abs(small)) {
				small=no[i];
			}
		}
		return small;
	}
	
	public static void main(String[] args) {
    FindTheClosestNumberToZero fcntz=new FindTheClosestNumberToZero();
	System.out.println(fcntz.closestNumber(new int[] /*{-4,-2,0,1,4,8}*/{2,-1,1}));
    		
	}
}
