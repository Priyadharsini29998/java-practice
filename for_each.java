import java.util.*;
import java.lang.Iterable;
class ForEach
{
	public static void main(String...arg)
	{
		int n , total=0 ;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int[] count = new int[n];
		
		int i=0;
		
		while(sc.hasNextInt()) {
			count[i] = sc.nextInt();
			i++;
			if(i == n)
			{
				break ;
			}
		}
		
		for(int val : count)
		{
			total = total + val ;
		}
		
		System.out.println(total);
	}
}