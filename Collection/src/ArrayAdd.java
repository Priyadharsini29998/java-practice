import java.util.ArrayList;
import java.util.*;

public class ArrayAdd {

	public static void main(String[] args) {
		int sum=0;
		double average = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>(n);
		
		
		for(int numbers=0;numbers<n;numbers++)
			{
			arr.add(sc.nextInt());
			}
		for(int i : arr)
			{
			 sum = sum + i;
			 average = sum / n ;
			}
		System.out.println(sum);
		System.out.printf("%.2f",average);
		

	}

}
