package practice_pck;

import java.util.Scanner;

import org.testng.annotations.Test;

public class java_practice {
  //@Test
  public void prime_number() {
	  int n=13;
	  int flag=0;
	  for(int i=2;i<=n/2;i++)
	  {
		  if(n%i==0)
		  {
			  System.out.println("Number is not prime");
			  flag=1;
			  break;
		  }
	  }
		  if(flag==0){
			  System.out.println("Number is prime");}
  }

@Test
public void triangle_pattern()
{
	for(int i=0;i<5;i++) //For moving to next row each time
	{
		for(int j=0;j<5-i;j++){ //For providing space
		System.out.print(" ");}
		for(int k=0;k<=i;k++) //For printing pattern
		{
		System.out.print("* ");}
		System.out.println();}
	}


//@Test
public void pyramid()
{
	int i, j;
    for(i=0; i<5; i++) //For moving to next row each time
    {
        for(j=0; j<=i; j++) //For printing pattern
        {
            System.out.print("* ");
        }
        System.out.println();
    }
}

//@Test
public void fibonacci()
{
	int n1=0; int n2=1; int n3;
	Scanner scan=new Scanner(System.in); //get user input for count
	System.out.println("Enter count");
	int count = scan.nextInt();
	//int count=10;
		System.out.print(n1 +" " +n2);
	
		for (int i=2;i<=count;i++)
		{
			n3=n1+n2;
		System.out.print(" " +n3);
		n1=n2;
		n2=n3;}
	}


//Program to count occurrence of a given character in a string
public static int count(String s, char c)
{
    int res = 0;

    for (int i=0; i<s.length(); i++)
    {
        // checking character in string
        if (s.charAt(i) == c)
        res++;
    } 
    return res;
}

//@Test
public void capitalise()
{
//String name  = "stackoverflow tested to passed"; 
//name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
//System.out.println(name);

	    String word = "it's java, baby!";
	    String[] wordSplit;
	    String wordCapital = "";
	    wordSplit = word.split(" ");
	    for (int i = 0; i < wordSplit.length; i++) {
	        wordCapital = wordSplit[i].substring(0, 1).toUpperCase() + wordSplit[i].substring(1) + " ";
	    }
	    System.out.println(wordCapital);
	 }

 
//@Test
public void countcharacter()
{
    String str= "geeksforgeeks";
    char c = 'e';
    System.out.println(count(str, c));
    
  //  or
    
//    int count = 0;
//    for (int i=0;i<str.length();i++)
//    {
//    	char c = str.charAt(i);
//    	if(c=='f')
//    		count=count+1;
//    }
//    System.out.println(count);
}
	}