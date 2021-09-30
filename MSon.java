abstract class Moneycollector
{
public abstract void debtor();
}
class MSon  extends Moneycollector
{
public static void main(String args[])
{
MSon n=new MSon();
n.debtor();
}
public void debtor()
{
System.out.println("i will give give money");
}
}