package Friday;

public class Star32 {
	public static void main(String args[])
	{
		int x=0;
		
		int n=5;
		
		for(int i=0;i<n;i++)
		{
			x=n-i;
			for(int j=1;j<=n;j++)
			{
			
				System.out.print((char)(x+65)+" ");
				x+=n;
				}
			System.out.println();
		
}
}
}
	