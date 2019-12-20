import java.util.Scanner;

public class ShapeMain {

public static void main(String[] args) {
		int length = 0, breadth = 0, side = 0, radius = 0;

		
		Scanner sc = new Scanner(System.in);

		System.out.println("1.Rectangle \n 2.Square \n 3.Circle");
		System.out.println("Area Calculator --- Choose your shape");
		int opt = Integer.parseInt(sc.nextLine());
		Shape shape = null;
		

		if (opt == 1) {
			System.out.println("Enter length and breadth :");
			length=Integer.parseInt(sc.nextLine());
			breadth=Integer.parseInt(sc.nextLine());
			shape = new Rectangle(length,breadth);
		} else if (opt == 2) {
			System.out.println("Enter side :");
			side=Integer.parseInt(sc.nextLine());
			shape = new Square(side);
		} else if(opt == 3){
			System.out.println("Enter radius :");
			radius=Integer.parseInt(sc.nextLine());
			shape = new Circle(radius);
		}
		else
		{
			System.out.println("Invalid Number");
		}
		System.out.printf("Area of %s is : %.2f",shape.getShapeName(),shape.calculateArea());

	}

}
