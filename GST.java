import java.util.Scanner;
public class GST {
	public static void main(String[] args){
		int BILL ;
		String Slno , Name,DATE ;
		double total , gst , grandTotal , price , qty , cgst , igst , sgst , camt, iamt,samt,DIST;
		Scanner input = new Scanner (System.in);
		System.out.println("BILL NO:");
		BILL = input.nextInt();
		System.out.println("DATE:");
		DATE = input.next();
		System.out.println("Enter SL number:");
		Slno = input.next();
		System.out.println("Name:");
		Name = input.next();
		System.out.println("QTY:");
		qty = input.nextDouble();
		System.out.println("PRICE:");
		price = input.nextDouble();
		total = qty*price;
		System.out.println("ENTER CGST:");
		cgst = input.nextDouble();
		camt = price*cgst/100;
		System.out.println("ENTER IGST:");
		igst = input.nextDouble();
		iamt = price*igst/100;
		System.out.println("ENTER SGST:");
		sgst = input.nextDouble();
		samt = price*sgst/100;
		gst=total*cgst/100 + total*igst/100 + total*sgst/100 ;
		System.out.println("DISCOUNT AMOUNT:");
		DIST= input.nextDouble();
		grandTotal = (gst+ total)- DIST;
		
		System.out.println("===================================");
		System.out.println("            K.R.FOODS ");   
		System.out.println("           KULLAPULLY");
		System.out.println("       PH.No:9087765346 ");
		System.out.println("===================================");
		System.out.println("BILL NO:"+BILL +"             "+"DATE:"+DATE );
		System.out.println("===================================");
		System.out.println("SL NO.         :         "+Slno);
		System.out.println("NAME           :         "+Name);
		System.out.println("QTY            :         "+qty);
		System.out.println("PRICE          :         "+price);
		System.out.println("===================================");
		System.out.println("TOTAL          :         "+total);
		System.out.println("===================================");
		System.out.println("CGST "+cgst +" %     :         "  +camt );
		System.out.println("IGST "+igst +" %     :         "  +iamt );
		System.out.println("SGST "+sgst +" %     :         "  +samt );
		System.out.println("===================================");
		System.out.println("GST AMT        :         "+gst);
		System.out.println("===================================");
		System.out.println("DISCOUNT       :         "+DIST);
		System.out.println("===================================");
		System.out.println("GRAND TOTAL    :         "+grandTotal);
		System.out.println("===================================");
		System.out.println("   THANK YOU , DO VISIT AGAIN   ");
		System.out.println("===================================");
		
	     
		
		
		
		
	}

}
