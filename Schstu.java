class Schstu
{
int roll,std;
String name;
public Schstu(String name,int roll,int std)
{
this.name=name;
this.roll=roll;
this.std=std;
System.out.println("name\t"+name+"\nrollnot"+roll+"\nstd\t"+std);
}
public Schstu(String name,int roll)
{
this.name=name;
this.roll=roll;

System.out.println("name\t"+name+"\nrollno\t"+roll);
}
public Schstu(String name)
{
this.name=name;

System.out.println("name\t"+name);
}
	public static void main(String args[])
	{
		Schstu s3=new Schstu("mano",22,21);
		s3.update();
		//Schstu s1=new Schstu("mani",22);
		//Schstu s2=new Schstu("maha");
	}
	Schstu update()
	{
		Schstu s3=new Schstu("mano",22,21);
		
	System.out.println("student1 information"+s3.name+" \n"+s3.roll+"\n"+s3.std);
		return s3;
	}
}