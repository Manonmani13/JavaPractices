package LoopingPro_20_10_21;

public class Num1_5_1_while {
	public static void main(String[] args) {
		int i=5;
		while(i>=1)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print(j);
				j++;
			}
			System.out.println();
			i--;
		}
	}
}
