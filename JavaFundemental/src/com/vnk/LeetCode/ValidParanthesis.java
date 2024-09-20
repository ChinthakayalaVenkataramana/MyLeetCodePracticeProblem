package com.vnk.LeetCode;
import java.util.Stack;
public class ValidParanthesis {
  public Boolean paranthesis(String pare) {
		/*while(true) {
		if(pare.contains("()")) {
		  pare.replace("()","");
		}else if(pare.contains("{}")) {
		  pare.replace("{}","");
		}else if(pare.contains("[]")) {
		  pare.replace("[]","");
		}else {		
		return pare.isEmpty();
		}
		}*/
		 Stack<Character> stack=new Stack<>();
		 for(char c:pare.toCharArray()) {
		  if(c=='(') {
			  stack.push(')');
		  }else if(c=='{') {
			  stack.push('}');
		  }else if(c=='[') {
			  stack.push(']');
		  }else if(stack.isEmpty()||stack.pop()!=c) {
			  return false;
		  }
		 }
		 return stack.isEmpty();
  }
	public static void main(String[] args) {
	ValidParanthesis vp=new ValidParanthesis();
	boolean b=vp.paranthesis("{}{}()");
	System.out.println(b);
	}
}
