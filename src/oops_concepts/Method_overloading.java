package oops_concepts;

public class Method_overloading {
void Uber_booking(String un,String pswd) {
	
	}

void Uber_booking(String fromlocation,String Tolocation,int passenger) {
	
}
void Uber_booking(String fromlocation,String Tolocation,int passenger,int paymentoption) {
	
}


public static void main(String[] args) {
	 Method_overloading obj=new  Method_overloading();
	 obj.Uber_booking("supraja","1234");
}
}
