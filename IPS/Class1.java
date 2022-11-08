package Bank 
java.util.*;
public class Bankdetail{
	int bank_id ;
	string bank_name;
	string branch;    //take input 
	Scanner obj = new Scanner();
	bank_id = obj.nextInt();
	bank_name = obj.nextLine();
	branch= obj.nextLine();
public void display(){
	system.out.println(bank_id);
	system.out.println(bank_name);
	system.out.println(branch);
}
}