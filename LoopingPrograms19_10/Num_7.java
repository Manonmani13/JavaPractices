package Looping19_10;

public class Num_7 {
	public static void main(String[] args) {
		int end=1;
		for(int row=1;row<=5;row++)
		{
			for(int col=row;col<=end;col++)
			{
			System.out.print(col);
			
			}
			System.out.println();
			end+=2;
		}
	}

}
