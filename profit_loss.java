import java.util.*;
class ProfitLoss
{
	public static void main(String...arg)
	{
		int n_doz , d_price , s_price , c_price ;
		float profit , pro_percent ; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of dozens of toys purchased:");
		n_doz=sc.nextInt();
		System.out.println("Enter the price per dozen :");
		d_price=sc.nextInt();
		System.out.println("Enter the selling price of 1 toy :");
		s_price=sc.nextInt();
		c_price = (d_price/12);
		profit = s_price - c_price ;
		pro_percent = (profit / c_price) * 100 ;
		System.out.printf("Sam's profit percentage is %.2f percent" ,pro_percent);
	}
}
		
		