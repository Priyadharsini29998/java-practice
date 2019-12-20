import java.util.Scanner;

public class CustomException {

	public static void main(String[] args) {
		int age ;
		String msg = null ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		age=Integer.parseInt(sc.nextLine());
		try
		{
			if(age>120 )
			{
				throw new AgeException(msg);
			}
			else
			{
				System.out.println("welcome to vote");
			}
		}
			catch(AgeException e)
			{
				System.out.println(e);
			}

	}

}
