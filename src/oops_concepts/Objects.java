package oops_concepts;

public class Objects {
	String empname;
	int empid;
	String empdept;
	String branch;
	public static void main(String[] args) {
		Objects s1=new Objects();
		s1.empname="supraja";
		s1.empid=123;
		s1.empdept="java";
		s1.branch="hyd";
		Objects s2=new Objects();
		s2.empname="maruthi";
		s2.empid=345;
		s2.empdept="java";
		s2.branch="hyd";
		Objects s3=new Objects();
		s3.empname="shanvi";
		s3.empid=2345;
		s3.empdept="java";
		s3.branch="hyd";
		Objects s4=new Objects();
		s4.empname="veeksha";
		s4.empid=234567;
		s4.empdept="java";
		s4.branch="hyd";
		s1=s2;
		System.out.println(s1.empname);
		System.out.println(s2.empname);
		System.out.println(s3.empname);
		System.out.println(s4.empname);
		System.out.println("----------");
		s2=s3;
		System.out.println(s1.empname);
		System.out.println(s2.empname);
		System.out.println(s3.empname);
		System.out.println(s4.empname);
		System.out.println("---------");
		s3=s4;
		System.out.println(s1.empname);
		System.out.println(s2.empname);
		System.out.println(s3.empname);
		System.out.println(s4.empname);
		System.out.println("---------");
		s4=s1;
		
		System.out.println("---------");
		System.out.println(s1.empname);
		System.out.println(s2.empname);
		System.out.println(s3.empname);
		System.out.println(s4.empname);
	}

}
