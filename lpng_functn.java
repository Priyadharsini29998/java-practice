import java.util.*;
class Looping
{
	public static void main(String...arg)
	{
		int count , total =0 ;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int[] count = new int[n] ;
		for(int i=0;i<n;i++)
		{
			count[i]=sc.nextInt();
			total=total+count[i];
		}
		System.out.println(total);
	}
}
		