package com.vnk.basics;
import java.util.Arrays;

public class LineSeparators {

	public static void main(String[] args) {
		String msg="Hello!"+System.lineSeparator()+"This Is Venkataramana";
		String msg1="Hi\nHow are you?";
		System.out.print(msg+"\n");
		System.out.println("Ramu");
		System.out.print(msg1+"\n");
        String[] msg2="This Is VenkataRaman. From Singanamala.... ".split(" ");
        System.out.println(Arrays.toString(msg2));
	}
}
