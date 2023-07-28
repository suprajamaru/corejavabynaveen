package Constructor;

public class Car {
	String make;
	String model;
 int year;
public Car(String make, String model, int year) {
	this.make = make;
	this.model = model;
	this.year = year;
	System.out.println(make+" "+model+" "+year);
	
}
public Car() {
	System.out.println(make);
	System.out.println(model);
	System.out.println(year);
}
public static void main(String[] args) {
	Car c= new Car("maruthisuzuki","suzuki143",2010);
	Car c1=new Car();
}
}
