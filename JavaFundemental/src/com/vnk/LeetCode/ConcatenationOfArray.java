package com.vnk.LeetCode;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ConcatenationOfArray {
 public int[] concateArray(int []arr) {
	 int[] con=IntStream.concat(Arrays.stream(arr), Arrays.stream(arr)).toArray();
	 return con;
 }
	public static void main(String[] args) {
		ConcatenationOfArray ctof=new ConcatenationOfArray();
		int in[]=ctof.concateArray(new int[] {1,2,1});
		for(int i:in) {
			System.out.print(i+",");
		}
	}
}
