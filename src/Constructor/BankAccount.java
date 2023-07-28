package Constructor;

public class BankAccount {
String accountNumber;
double balance;
public BankAccount(String accountNumber, double balance) {
	this.accountNumber = accountNumber;
	this.balance = balance;
	System.out.println(accountNumber+" "+balance);
}
public double  deposit(double addBalance) {
balance=balance+addBalance;
return balance;
	
}
public double withdraw(double withdrawamount) {
	balance=balance-withdrawamount;
	return balance;
}
public static void main(String[] args) {
	BankAccount obj=new BankAccount("134545677",20000.0);

System.out.println(obj.deposit(10000));
System.out.println(obj.withdraw(5000));

}
}

