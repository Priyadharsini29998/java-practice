import java.util.Scanner;

public class DeliveryMain {

	public static void main(String[] args) {
		int opt = 0;
		String batsman,bowler = null ;
		Scanner sc = new Scanner(System.in);
		Delivery d1 = new Delivery();
		Delivery d2=new Delivery();
		String str = new String();
		String str2 = new String();
		System.out.println("Menu");
		System.out.println("1.Player details of the delivery");
		System.out.println("2.Run details of the delivery");
		opt=Integer.parseInt(sc.nextLine());
		if(opt==1)
		{
			System.out.println("Enter the bowler name");
			batsman = sc.nextLine();
			int lname1 = str.indexOf(" ");
			String name1 = str.substring(lname1 , str.length());
			System.out.println("Enter the batsman name ");
			bowler = sc.nextLine();
			int lname2 = str2.indexOf(" ");
			String name2 = str2.substring(lname2 , str2.length());
			d1.displayDeliveryDetails(name1, name2);
		}
		else
		{
			System.out.println("Enter the number of runs");
			long runs = Long.parseLong(sc.nextLine());
			d2.displayDeliveryDetails(runs);
			
		}
	}

}
