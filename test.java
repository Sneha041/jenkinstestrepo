package bank;
public class BankAccountClass {
  int accno;
  String name;
  double balance;
  
  
  public void BankAccount () {
	  this.accno = 0;
	  this.name = " ";
	  this.balance = 0.0;
  }
  
  public void BankAccount(int accnum, String name, double balance) {
	  this.accno = 12345;
	  this.name= "Sneha";
	  this.balance = 20000.0;
  }
  
  public void deposit(int amount) {
	  balance = balance+amount;  
  }
  public void withdraw(int amount) {
	  if(balance > amount) {		  balance -= amount;
	  }else {
		  System.out.println("Cannot withdraw"+amount+". Existing balance is "+balance);
	  }
  }
  public void showDetails() {
	  System.out.println("Account No: "+accno);
	  System.out.println("Name: "+name);
	  System.out.println("Balance: "+balance);
  }
}
