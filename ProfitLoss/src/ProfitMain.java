import java.util.Scanner;

public class ProfitMain {
	private static int rate;
	private static int sellprice;
	private static int dozens;


	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		ProfitCal pro = new ProfitCal();
		System.out.println("Enter the number of dozens of toys purchased ");
		dozens=sc.nextInt();
		pro.setDozens(dozens);
		System.out.println("Enter the price per dozen");
		rate=sc.nextInt();
		pro.setRate(rate);
		System.out.println("enter the selling price of 1 toy");
		sellprice=sc.nextInt();
		pro.setSellprice(sellprice);
		
		pro.calProfit();
		
		pro.display();
		
	}
}
