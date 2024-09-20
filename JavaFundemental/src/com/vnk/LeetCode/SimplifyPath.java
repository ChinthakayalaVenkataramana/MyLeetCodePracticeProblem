package com.vnk.LeetCode;

import java.util.Arrays;
import java.util.Stack;

public class SimplifyPath {
   public static String simplePath(String path) {
	   Stack<String>stack=new Stack<>();
	   for(String p:path.split("/")) {
		   if(!stack.isEmpty()&&"..".equals(p))
			   stack.pop();
		   else if(!Arrays.asList("",".","..").contains(p)) {
			   stack.push(p);
		   }
	   }
	   return "/"+String.join("/",stack);
		   
   }
	public static void main(String[] args) {
		System.out.println(simplePath(/*"/home//foo/"*/"/home/user/Documents/../Pictures"));
	}

}
