package Practices20_10_21;

public class Pro1_49 {
	public static void main(String[] args) {
		int k=1;
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=5;j++)
			{
				System.out.print("  "+k+"  ");
				
				k+=2;
			}
			
			System.out.println();
		}
	}
}
