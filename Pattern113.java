package com.logic;

public class Pattern113 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		for(int j=i;j<=4;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print((char)(i+64));
		}
		System.out.println();
	}
}
}
