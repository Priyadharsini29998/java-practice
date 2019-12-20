public class Shape {
	
		protected String shapeName;

		public Shape(String shapeName) {
			super();
			this.shapeName = shapeName ;
				// TODO Auto-generated constructor stub
		}
		public String getShapeName() {
			return shapeName;
		}
		public void setShapeName(String shapeName) {
			this.shapeName = shapeName;
		}
		public double calculateArea() {
			return 0.0;
		}
	}
