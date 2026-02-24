package mycodes;

abstract class Account{
	double deposit;
	double balance;
	double withdraw;
	
	abstract void Deposit(double deposit);
	abstract void Withdraw(double withdraw); 
	abstract void Displaybal();
}
class Acctuser extends Account {
	void Deposit(double deposit) {
    	if(deposit == 0) {
    		System.out.println("Please Enter Valid Amount to Deposit");
    	}else {
	    	balance += deposit;
	    	System.out.printf("Amount %.2f added successfully\n", deposit);
	    	System.out.printf("Current Balance is %.2f \n", balance);
    	}
	}
	
	void Withdraw(double withdraw) {
	   	if(withdraw == 0) {
    		System.out.println("Please Enter Valid Amount to Withdraw");
    	}else {
    		if(withdraw < balance) {
            	balance -= withdraw;
            	System.out.printf("Amount %.2f withdrawed successfully\n", withdraw);
            	System.out.printf("Current Balance is %.2f \n", balance);
        	}else {
        	System.out.println("Insufficient Balance");
        	}
    	}
	}
	
	void Displaybal() {
		System.out.println("Your Current Balance is:" + balance);
	}
	
}


public class ATMabstract {
	public static void main(String[]args) {
		
		Account obj = new Acctuser();
		obj.Deposit(500000);
		obj.Withdraw(2000);
		obj.Displaybal();
		
	}
}
