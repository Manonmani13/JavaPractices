package LoopingPro_20_10_21;

public class Num1_1_5_while {
	public static void main(String[] args) {
		int i=1;
		while(i<=5)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
