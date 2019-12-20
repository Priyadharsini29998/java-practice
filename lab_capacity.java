import java.util.*;
class JavaLab
{
	public static void main(String...arg)
	{
		int lab1,lab2,lab3;
		Scanner lab=new Scanner(System.in);
		System.out.println("Enter Lab1 capacity :");
		lab1=lab.nextInt();
		System.out.println("Enter Lab2 capacity :");
		lab2=lab.nextInt();
		System.out.println("Enter Lab3 capacity :");
		lab3=lab.nextInt();;
		
		if(lab1<lab2)
		{
			if(lab1<lab3)
			{
			System.out.println("L1 has the minimal capacity");
			}
			else
			{
			System.out.println("L3 has minimal capacity");
			}
		}
		else
		{
			System.out.println("L2 has minimal capacity");
		}
	}
}