
public class Swapping {
		public static void main(String args[])
	  {
		int x=5 , y=6;
		
		System.out.println("Before swaping");
		System.out.println(" x = " + x);
		System.out.println(" y =" + y);
		
		x= x * y;
		y=x/y;
		x=x/y;		
				
		
		System.out.println("After swaping");
		System.out.println(" x = " + x);
		System.out.println(" y = " + y);
	  }
}
