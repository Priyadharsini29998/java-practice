import java.util.*;
class DisCal
{
	public static void main(String...arg)
	{
		float item1 , item2 , tot , dis_amt , sav_amt ;
		int discount ; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Price of product 1 :");
		item1=sc.nextFloat();
		System.out.println("Price of product 2 :");
		item2=sc.nextFloat();
		System.out.println("Discount in percentage :");
		discount=sc.nextInt();
		tot = item1 + item2 ;
		sav_amt=tot/10;
		dis_amt=tot - sav_amt ;
		System.out.printf("Total amount : %.2f\n",tot);
		System.out.printf("Discounted amount : %.2f\n",dis_amt);
		System.out.printf("Saved amount : %.2f\n",sav_amt);
	}
}
		