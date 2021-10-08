package Practice8_10_2021;

public class PrimefullPro {
	int n=11;
	int i=2; 
	boolean not_prime=false;
	void prime()
	{
		while(i<n)
		{
			if(n%i==0)
			{
				//System.out.println("not prime");
				boolean not_prime=true;
				break;
			}
			i=i+1;
		}
		if(not_prime==true)
		{
			System.out.println("Not Prime ");
		}
		else
		{
			System.out.println("Prime Number");
		}
	}
	public static void main(String[] args) {
		PrimefullPro p=new PrimefullPro();
		p.prime();
	}
}
