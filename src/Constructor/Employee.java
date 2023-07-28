package Constructor;
public class Employee {
String name;
int id;
double salary;
//double updated_Salary;
public Employee(String name, int id, double salary) {
    this.name = name;
	this.id = id;
	this.salary = salary;	
}
public String getName() {
	return name;
}
//public double getupdated_Salary() {
//	return updated_Salary;
//}
//public void setupdated_Salary() {
//	updated_Salary=this.salary*10/100;
//	this.updated_Salary=updated_Salary;
//}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	double salary1=salary+salary*10/100;
	this.salary = salary1;
	}
public static void main(String[] args) {
	 Employee e=new  Employee("maruthi",12345,500000);
	 System.out.println(e.getName()+" "+e.getId()+" "+e.getSalary());
	 System.out.println(e.getSalary());
	}
}
