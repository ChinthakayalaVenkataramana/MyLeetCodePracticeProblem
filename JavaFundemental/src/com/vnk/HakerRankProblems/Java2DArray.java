package com.vnk.HakerRankProblems;
import java.io.IOException;
import java.util.Scanner;
public class Java2DArray {
	public static void main(String[] args) throws IOException {
		//List<List<Integer>> list=new ArrayList<>();
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Array Size");
			int size=sc.nextInt();
			int[][] arr=new int[size][size];
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length;j++) {
					System.out.println("Enter value for :: "+i+" "+j+" Position :");
					arr[i][j]=sc.nextInt();
				}	
			}
			System.out.println("Your Entering values Completed....");
			
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
				}
			
			int m=Integer.MIN_VALUE;
			
			for(int i=0;i<4;i++) {
				for(int j=0;j<4;j++)
					m=Math.max(m,arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]);
					System.out.println(m);
			}
			System.out.println("Max Value : "+m);
			sc.close();		
	}
}
