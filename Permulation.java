package logicprograms;

public class Permulation {
public static void main(String[] args) {
	int n1=5,n2=3;
	System.out.println(fact(n1)/(fact(n1-n2)* fact(n2)));
	System.out.println(fact(n1)/fact(n1-n2));
	
}
static int fact(int num )
{
	int fact=1;
	for(int i=1;i<=num;i++)
	{
		fact=fact*i;
	
	}
	return fact;
}
}
