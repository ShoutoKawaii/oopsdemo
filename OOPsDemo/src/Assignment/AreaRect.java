package Assignment;

public class AreaRect {
	
	double len;
	double bread;
	float area;

	public AreaRect(double len, double bread) {
		this.len = len;
		this.bread = bread;
	}
	public float returnArea() {
		area = (float) (len*bread);
		return area;
	}
		
	void display() {
		System.out.println("Area of rectangle: "+area);
	
	}
	
	public static void main(String[] args) {
		AreaRect rect1 = new AreaRect(4.69, 2.29);
		
		rect1.returnArea();
		rect1.display();
	}

}
