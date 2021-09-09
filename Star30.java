package Thursday;

public class Star30 {
	public static void main(String args[]) {
		char ch='A';
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(ch+"");
				if(ch<='Z')
				{
					ch++;
				}
				else
				{
					ch=(char)'A';
				}
			}
			System.out.println();
		}
	}
}
