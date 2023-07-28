package Constructor;

public class Rectangle extends Person{
double length;
double width;
public Rectangle(double length, double width) {
	this.length = length;
	this.width = width;
	profession();

}
private Rectangle() {
	System.out.println(length);
	System.out.println(width);
	
}
public double calculateArea() {
	double area=length*width;
	return area;
	
}
public static void main(String[] args) {
	Rectangle r=new Rectangle();
	Rectangle r1=new Rectangle(10.2,12);
	System.out.println(r1.calculateArea());
}
}
