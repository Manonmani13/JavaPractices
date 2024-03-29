package com.lamda.learning;

import java.util.ArrayList;
import java.util.List;

public class EQUALS {
public static void main(String[] args) {
	String s="manom";
	String s1="mano";
	String cont="";
	int count=0;
	for(int i=0;i<s.length();i++)
	{
		
		for(int j=i;j<s.length();j++) {
			if(s.charAt(i)==s.charAt(j)) {
				System.out.println(s.charAt(i) +" "+ (++count));

			}
		}
		if(count>1)
			cont=""+s.charAt(i);
		count=0;

		

		
	}
////	for(int i=0;i<s.length();i++)
////	{
////		for(int j=i;j<s1.length();j++)
////		{
////			if(s.charAt(i)==s1.charAt(j)) {
////				System.out.println(s.charAt(i));
////			}
////		}
//	}
}
}
