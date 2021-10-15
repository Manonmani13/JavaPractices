package Oct_15_2021;

public class FiboAndPrime {
	 int f=0,s=1,i=1;
	 int t;
	 void fib()
	{
		 System.out.println("Fibonaccis series");
		while(i<20)
		{
			t=f+s;
			//System.out.println(i+" ->"+t);
			prime(t);
			f=s;
			s=t;
			i++;
			
		}
	}
	 public static boolean prime(int n)
	 {
		 boolean not_prime=false;
		 int i=1;
		 while(i<n)
			{
				if(n%i==0)
				{
				
				not_prime=true;
					break;
				}
				i=i+1;
			}
			if(not_prime==false)
			{
				System.out.println(n);
			}
			else
			{
				return not_prime;
			}
			
			return not_prime;
	 }
public static void main(String[] args) {
	FiboAndPrime fp=new FiboAndPrime();
	fp.fib();
	//fp.prime(70);
	
}
}
