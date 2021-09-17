package Friday;

public class Star31 {
	
public static void main(String args[])
{
	int x=0;
	int n=5;
	
	for(int i=0;i<n;i++)
	{
		x=i;
		for(int j=1;j<=n;j++)
		{
			x+=n;
			System.out.print((char)(x-n+65)+" ");
			}
		System.out.println();
	}
}
}
