package com.vnk.LeetCode;

public class LengthOfLastWord {
   public int lastWordLength(String s) {
	   int x=s.length()-1;
       while(x>=0 && s.charAt(x) == ' '){
           x--;
       }
      int y=x;
       while(y>=0 && s.charAt(y)!=' '){
           y--;
       }
       return x-y;
   }
	public static void main(String[] args) {
		LengthOfLastWord lg=new LengthOfLastWord();
		System.out.println(lg.lastWordLength("   fly me   to   the moon  "));
	}
}
