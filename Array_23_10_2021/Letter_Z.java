package Array_23_10_2021;

public class Letter_Z {
public static void main(String[] args) {
	for(int i=1;i<=7;i++)
	{
		for(int j=1;j<=7;j++)
		{
			if(i==1||i==7||i==6&&j==2||i==5&&j==3||i==4&&j==4||i==3&&j==5||i==2&&j==6)
			System.out.print("*");
			
			else
				System.out.print(" ");
		}
		
		System.out.println();
	}
}
}
/*
*******
     * 
    *  
   *   
  *    
 *     
*******


*/