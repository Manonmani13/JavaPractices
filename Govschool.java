public class Govschool
{
String name;
int mark1,mark2,mark3,mark4,mark5;
int lab2,lab3;
	long lab1;
Govschool(String name,int mark1,int mark2,int mark3,long lab1,int lab2,int lab3)
{
this.name=name;
this.mark1=mark1;
this.mark2=mark2;
this.mark3=mark3;

this.lab1=lab1;
this.lab2=lab2;
this.lab3=lab3;
	System.out.println("biostudent");
}
Govschool(int mark1,int mark2,int mark3,long lab1,int lab2,String name)
{	
this.name=name;
this.mark1=mark1;
this.mark2=mark2;
this.mark3=mark3;

this.lab1=lab1;
this.lab2=lab2;
	System.out.println("CSE student");
}
Govschool(int mark1,String name,int mark2,int mark3,int mark4,long lab1)
{
this.name=name;
this.mark1=mark1;
this.mark2=mark2;
this.mark3=mark3;
this.mark4=mark4;

this.lab1=lab1;
	System.out.println("Accounts");
}
Govschool(String name,int mark1,int mark2,int mark3,int mark4,int mark5)
{
this.name=name;
this.mark1=mark1;
this.mark2=mark2;
this.mark3=mark3;
this.mark4=mark4;
this.mark5=mark5;
	System.out.println("Histroy");
}
public static void main(String args[])
{
Govschool cseStudent=new Govschool(50,60,70,65,80,"maha");
Govschool bioStudent=new Govschool("kirthikshan",60,50,70,80,90,70);
Govschool accStudent=new Govschool(60,"mano",70,86,78,89);
Govschool hisStudent=new Govschool("reka",80,90,78,67,88);
	cseStudent.admi();
	bioStudent.lead();
	accStudent.list();
	hisStudent.write();
}
	void admi()
	{
		//System.out.println(name+" "+mark1+" "+mark2+" "+mark3+" "+mark4+" "+mark5+ " "+lab1+" "+lab2);
		System.out.println(name+" "+mark1+" "+mark2+" "+mark3+" "+lab1+" "+lab2);
	
	}
	void lead()
	{
		//System.out.println(name+" "+mark1+" "+mark2+" "+mark3+" "+mark4+" "+mark5+" "+lab1+" "+lab2+" "+lab3);
		System.out.println(name+" "+mark1+" "+mark2+" "+mark3+" "+lab1+" "+lab2+" "+lab3);
}
	void list()
	{
			//System.out.println(name+" "+mark1+" "+mark2+" "+mark3+" "+mark4+" "+mark5+" "+lab1);
		System.out.println(name+" "+mark1+" "+mark2+" "+mark3+" "+mark4+" "+lab1);
	}
	void write()
	{
		System.out.println(name+" "+mark1+" "+mark2+" "+mark3+" "+mark4+" "+mark5);	
	}
}
