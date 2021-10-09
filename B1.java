public class B1 extends B
{
public static void main(String args[])
{
B1 n=new B1();
n.m1(56);
n.m1(44,56);
n.m1(23,"manonmani");
n.m1("manonmani",48);
}
public static void m1(int i)
{

System.out.println(" first m1 method from B1 class"+i);
}
public void m1(int i,int j)
{
System.out.println("two arguments with int data typen from B1"+(i+j));
}
public void m1(int i,String name)
{
System.out.println("two arguments with int and String from B1"+i+name);
}
public void m1(String name,int i)
{

System.out.println("String name and int from B1"+i+name);
}
}