package wednesday;

public class Star15 {
public static void main(String args[]) {
	int n=5,x,y;
	for(int i=1;i<=n;i++)
	{
		x=i;
		y=n-i+1;
		for(int j=1;j<=n;j++) {
			if(j%2==0) {
			System.out.print("\t"+x);
			}
			else
			{
				System.out.print("\t"+y);
			}
			x=x+n;
			y=y+n;
		}
		System.out.println();
	}
}
}
