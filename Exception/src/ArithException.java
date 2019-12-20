import java.util.Scanner;

public class ArithException {

	public static void main(String[] args) {
		int val1 , val2 , quotient ;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the 2 numbers");
			val1=Integer.parseInt(sc.nextLine());
			val2=Integer.parseInt(sc.nextLine());
			quotient = val1/val2;
			System.out.println("The quotient of" + val1 + "/" +val2+ "=" +quotient);
			}
		catch(ArithmeticException e)
		{
			System.out.println("DivideByZeroException caught");
		}
		finally {
			System.out.println("Inside finally block");
		}

	}

}
