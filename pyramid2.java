import java.util.Scanner;
public class pyramid2 {
	   public static void main(String args[]){
	      int i, j, input;
	      char symbol;
	      Scanner scan = new Scanner(System.in);
	      System.out.println("Enter the number of rows : ");
	      input = scan.nextInt();
	      System.out.println("Enter the symbol : ");
	      symbol=scan.next().charAt(0);
	      System.out.println("The pyramid pattern : ");
	      for (i=0; i<input; i++){
	        for (j=input-i; j>1; j--){
	           System.out.print(" ");
	        }
	        for (j=0; j<=i; j++ ){
	           System.out.print(symbol+" ");
	        }
	        System.out.println();
	      }
	   }
	}
