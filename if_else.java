import java.util.*;
class RelateInput
{
	public static void main(String...arg)
	{
		int val1;
		int val2;
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the first number : ");
		val1=sc1.nextInt();
		System.out.println("Enter the second number : ");
		val2=sc1.nextInt();
		if(val1>val2)
		{
			System.out.println(val1+" is greater than "+val2);
		}
		else
		{
			System.out.println(val1+" is less than "+val2);
		}
	}
}
