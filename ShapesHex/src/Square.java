
public class Square extends Shape {
	int side;
	
	
	public Square(int side) {
		super("Square");
		this.side = side ;
			// TODO Auto-generated constructor stub
	}
	public double calculateArea() {
		return side*side;
	}
}
