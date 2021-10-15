package Oct_15_2021;

public class Prime1_20 {
public static void main(String[] args) {
	
int i=1,n=20,j=2;
boolean s=false;
while(i<=n)
{
	while(j<=n)
	{
	if(i%n==0)
	{
		s=true;
		break;
	}
	i++;
}
	j++;
}
if(s==false)
{
	System.out.println(i);
}
}
}

