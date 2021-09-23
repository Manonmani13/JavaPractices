
public class Ch extends Pa
{
int i = 200; 
static int j = 2000; 
public static void main(String[] args)
{
Pa p = new Ch(); // Dynamic Binding
p.watchNews(); 
p.walk(); 
System.out.println(p.i); 
System.out.println(p.j); 
p.takeRest(); 
}
public static void walk()
{
System.out.println("Going for a walk - Child");  
}
public void work()
{
System.out.println("Writing Java Programs"); 
}

public void watchNews()
{
System.out.println("Social Media"); 
}
}

