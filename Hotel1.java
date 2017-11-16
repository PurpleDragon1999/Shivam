import java.util.*;
class Hotel1
{
 Scanner s1=new Scanner(System.in);
 String c_name,c_num;
 int op1;
 double price;
 Hotel1(int x)
 {
  if(x==1)
  {
   System.out.println("Enter 1 for Single Bed Rooms");
   System.out.println("Enter 2 for Double Bed Rooms");
   System.out.println("Enter 3 for Family Rooms");
   int a=s1.nextInt();
   this.suites(a);
  }
  else
  {
   System.out.println("Enter 1 for BIRTHDAY PARTIES");
   System.out.println("Enter 2 for WEDDING");
   int a=s1.nextInt();
   this.hall(a);
  }
  
 }
 
 void suites(int x)
 {
   if(x==1)
   {
	   price=2500;
   }	   
   else if(x==2)
   {
	   price=4000;
   }
   else
   {
	   price=6000;
   }
   System.out.println("Enter CHECK-IN Date");
   String cin=s1.next();
   System.out.println("Enter CHECK-OUT Date");
   String cout=s1.next();
   System.out.println("Room Available");
   System.out.println("Enter 1 for booking");
   op1=s1.nextInt();
   if(op1==1)
   {
	   System.out.println("Enter your name");
	   c_name=s1.next();
	   System.out.println("Enter your contact number");
	   c_num=s1.next();
	   System.out.println("Price per Day : "+price);
	   int otp=100+(int)(Math.random()*100000);
	   System.out.println("Please carry this OTP with you for Verification");
	   System.out.println("Your OTP is : "+otp);
   }
   else
   {
	   System.out.println("Wrong option");
   }
  
 } 
 
 
 void hall(int x)
 {
	 if(x==1)
	 {
		 price=10000;
	 }
	 else
	 {
		 price=14000;
	 }
		 System.out.println("Enter event date");
         String cdate=s1.next();
         System.out.println("Hall Available");
         System.out.println("Enter 1 for booking");
         op1=s1.nextInt();
         if(op1==1)
		 {
			 System.out.println("Enter your name");
	         c_name=s1.next();
	         System.out.println("Enter your number");
	         c_num=s1.next();
			 System.out.println("Price per Day: "+price);
			 int otp=100+(int)(Math.random()*100000);
			 System.out.println("Please carry this OTP with you for Verification");
			 System.out.println("Your OTP is : "+otp);
		 }	
         else
		 {
			System.out.println("Wrong Choice"); 
		 }		 
	 
 }
 
 
 public static void main(String args[])
 {
  Scanner s2=new Scanner(System.in);	 
  System.out.println("Welcome!");
  System.out.println("Choose your option");
  System.out.println("Enter 1 for SUITES");
  System.out.println("Enter 2 for HALLS");
  int op=s2.nextInt();
  Hotel1 h1=new Hotel1(op);
  System.out.println("THANK YOU");
  }
}