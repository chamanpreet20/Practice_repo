package practice_pck;

public class prc {
	 static int wheel = 2;
	 int price = 25000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 //static method.
		  //Can access static methods directly Inside static method.
		  byke1();
		  
		  //Can access static variables directly Inside static method.
		  System.out.println("Main static method : wheels = "+wheel);  
		  prc sn = new prc();   
		  sn.byke2();
		  System.out.println("Main static method : price = "+sn.price); 

		 }
		 
		 public static void byke1(){ //static method.
		  //Can access static variables directly Inside static method.
		  System.out.println("byke1 static method : wheels = "+wheel);
		  prc sn1 = new prc(); 
		  sn1.byke2();
		  //Can not access non static variables directly inside static method.
		  //System.out.println(price);
		  
		 }
		 
		 public void byke2(){ //non static method.
		  //Can access static variable directly inside non static method.
		  System.out.println("byke2 Non static method : wheels = "+wheel);
		  
		  //Can access non static variable directly inside non static method.
		  System.out.println("byke2 Non static method : price = "+price); 
		  
		  //Can access static methods directly Inside non static method.
		 // byke1();
		 }
		

	}


