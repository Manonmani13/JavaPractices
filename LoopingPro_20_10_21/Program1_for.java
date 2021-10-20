package LoopingPro_20_10_21;

public class Program1_for {
public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<i;j++)
		{
		System.out.print(" ");	
		}
		for(int k=1;k<6-i;k++)
		{
			//System.out.print("*");
			System.out.print(" "+"*"+" ");
		}
		System.out.println();
	}
}
}
