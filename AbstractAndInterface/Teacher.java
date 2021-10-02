package AbstractAndInterface;

public class Teacher extends Person {
	String name;
	int age;
	double salary;
	String subject;
Teacher(String name,int age,double salary,String subject)
{
	this.name=name;
	this.age=age;
	//super(name,age);
	this.salary=salary;
	this.subject=subject;
	System.out.println(name+" "+age+" "+salary+" "+subject);
}
public static void main(String args[])
{
	Teacher n=new Teacher("mano",22,12000,"java");
}
}
