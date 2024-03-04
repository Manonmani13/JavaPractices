package patternapp;

public class Pattern67 {
public static void main(String[] args) {
	for(int i=5;i>=1;i--)
	{
		for(int j=5;j>=i;j--)
		{
			System.out.print((char)(j+64));
		}
		System.out.println();
	}
}
}
