import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArraySort {

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
		Collections.sort(arr);
		for(int i : arr)
			{
			 System.out.println(i);
			}

	}

}
