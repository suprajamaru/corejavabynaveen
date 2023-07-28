package Constructor;

public class Person {
	String name;
	int age;
	char gender;
	double height;
    public Person(String name, int age, char gender, double height) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		// System.out.println(name);
		profession();
		new Person();
	}

	public void profession() {

	}

	public Person() {

	}

	public static void main(String[] args) {
		Person p = new Person("shanvi", 28, 'f', 5.5);
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.gender);
		System.out.println(p.height);
		Person p1 = new Person("maruthi", 34, 'm', 5);
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.gender);
		System.out.println(p1.height);

	}

}