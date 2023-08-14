import java.util.Scanner;
public class login {
	public static void main(String[] args){
		String userid , password , user , pass ,enter,en;
		double camt , Wamt,bamt;
		Scanner input = new Scanner(System.in);
		System.out.print("User Id : ");
		userid = input.next();
		System.out.print("Password : ");
		password = input.next();
		en = "1";
		user= "Ajal";
		pass= "12345";
		camt=100000;
		if (userid.equals(user) && password.equals(pass)) {
				System.out.println("SUCCESSFULLY LOGGED IN ");
				System.out.println("Enter Your Option: ");
				System.out.println("1) Saving account ");
				System.out.println("2) Current account");
				System.out.println("3) Balance enquiry ");
				enter = input.next();
				if (en.equals(enter)){ 
					System.out.println("ENTER YOUR WITHDRAWL AMOUNT : ");
					Wamt=input.nextDouble();
					if(Wamt>camt){
						System.out.println("INSUFFICIENT BALANCE !!!!! ");
						System.out.println("BALANCE AMOUNT:"+camt);}
					else{System.out.println("Withdrawl Successsful ");
					bamt=camt- Wamt ;
					System.out.println("BALANCE AMOUNT : "+bamt);}}
				else {
					System.out.println("unvalid option!!!!!!!!!! ");
				}
				}
		else {
			System.out.println("INVALID USERNAME AND PASSWORD ");
			}	
		}
}


