package logicprograms;

public class BinaryAddition {
public static void main(String[] args) {
	String x="11",y="01";
	int n1=Integer.parseInt(x,2);
	int n2=Integer.parseInt(y,2);
	System.out.println(n1+" "+n2);
	int sum=n1+n2;
	String sumof=Integer.toBinaryString(sum);
	System.out.println(sumof);
}
}
