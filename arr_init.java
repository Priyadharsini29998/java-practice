import java.util.*;
class ArrayInit
{
	public static void main(String...arg)
	{
		int i ; 
		String[] days = {"" , "Sunday" , "Monday" , "Tuesday" , "Wednesday" , "Thursday" , "Friday" , "Saturday" };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day number ");
		i=sc.nextInt();
		System.out.println("The day is "+days[i]);
	}
}