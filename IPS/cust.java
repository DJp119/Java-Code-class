package Customer 
import Bank.*;

public class cust{
	string customer_name;
	string account_type;
	int min_balance , up_balance;
	int balance =1000; 
	Scanner obj1 = new Scanner(System.in);
void input(){
	 customer_name = obj1.next();
	account_type = obj1.next();
	min_balance = obj1.nextInt();
	//balance = obj1.nextint();
}
void withdraw(int x){
if(amt_with >= min_balance){
	up_balance = min_balance - amt_with;
}
else {
	system.out.println("Invalid")
}
}
void deposit(){
	up_balance = min_bal
}
}
class CustDetail{
public static void main(String args[]){
	Bandetail x1 = new Bankdetail();
	x1.display();
	cust x2 = new cust();
	x2.input();
	x2.withdraw();
	x2.deposit();

}
}

	//if(min_balance<(balance-x)){
	//system.out.println("Invalid")
	//	}
//	else system.out.println("Balance left is "+(balance-x))
//	void deposit(int y){/
//public void methodClassTwo(){	
}
	}
}
}