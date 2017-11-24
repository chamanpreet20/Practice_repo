package practice_pck;

public class delete {

	public void method() {
		// TODO Auto-generated method stub
//System.out.println();
		try{
		/*int a[]={1,2,3,4};
		for (int i=0;i<=4;i++)
		{
System.out.println("array value is" +a[i]);}*/
		
		String b[][]=new String[3][2];
		b[0][0]="String1";
		b[0][1]="String 2";
		b[1][0]="String 3";
		b[1][1]="String 5";
		b[2][1]="String 4";
		b[2][0]="String 7";
		for (int j=0;j<3;j++)
		{
			for(int k=0;k<2;k++)
			{System.out.println("String value is" +b[j][k]);
		}
		}
		}
		catch(Exception e){System.out.println("Exception occur");}
}
	
	public static void main(String[] args)
	{
		for(int i=0;i<=3;i++)
		{ 
			for(int j=0;j<3-i;j++)
				{System.out.println(" ");}
			for(int k=0;k<=i;k++)
			{System.out.println("* ");}}
		//	System.out.println();}
	}
	}


