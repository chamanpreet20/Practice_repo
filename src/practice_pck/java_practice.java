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

@Test
//Reverse String wo string builder
public void ReverseString
{
        System.out.println("Enter string to reverse:");
        
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String reverse = "";
        
        
        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }
        
        System.out.println("Reversed string is:");
        System.out.println(reverse);
    }
}

@Test
//Reverse String with stringbuilder
    public void reversebuilder()
    { 
        String input = "Geeks for Geeks"; 
  
        StringBuilder input1 = new StringBuilder(); 
  
        // append a string into StringBuilder input1 
        input1.append(input); 
  
        // reverse StringBuilder input1 
        input1 = input1.reverse(); 
  
        // print reversed String 
        System.out.println(input1); 
// or System.out.println(input1.append(str).reverse());
    } 

@Test
//Find duplicate characters in a string

 public void findduplicate() {
  String str = "java2blog.com ";
  HashMap charCountMap = new HashMap();
  for (int i = 0; i < str.length(); i++) {
   char c = str.charAt(i);
 
   if (charCountMap.containsKey(c)) {
    charCountMap.put(c, charCountMap.get(c) + 1);
   } else {
    charCountMap.put(c, 1);
   }
 
  }
  for (Character c : charCountMap.keySet()) {
   if (charCountMap.get(c) > 1)
    System.out.println("duplicate character : " + c + " ====== " + " count : " + charCountMap.get(c));
 
  }
 
 }

@Test
//Find maximum of 2 arrays
   public void maxarray() {  
    {   int[] arr = { 2, 3, 5, 2, 6, 7, 2, 5, 8 };  
        int max = 0;  
        int secondMax = 0;  
  
        for (int i : arr)  
            if (i > max) {  
                secondMax = max;  
                max = i;  
            } else if (i > secondMax)  
                secondMax = i;  
  
        System.out.println("Max: " + max + " Second Max: " + secondMax);  
    }  
 
}

@Test
//count occurence of a character in string

public void int countOccurrences(String str, char ch) {
    int counter = 0;
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == ch) {
            counter++;
        }
    }
    return counter;
} 

@Test
//count occurence of all characters using hashmap
  static void characterCount(String inputString)
    {
	  String str = "geeksforgeeks"; 
        //Creating a HashMap containing char as a key and occurrences as  a value
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        //Converting given string to char array
        char[] strArray = inputString.toCharArray();
        //checking each char of strArray
        for (char c : strArray)
        {
            if(charCountMap.containsKey(c))
            {
                //If char is present in charCountMap, incrementing it's count by 1
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else
            {
                //If char is not present in charCountMap,
                //putting this char to charCountMap with 1 as it's value
                charCountMap.put(c, 1);
            }
        }
        //Printing the charCountMap
        System.out.println(charCountMap);
    }

@Test
//find odd and even
public void oddeven()
   {
      int x;
      System.out.println("Enter an integer to check if it is odd or even");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
     
      if (x % 2 == 0)
         System.out.println("The number is even.");
      else
         System.out.println("The number is odd.");
   }
}
}
