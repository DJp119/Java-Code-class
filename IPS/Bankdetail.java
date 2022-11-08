package Bank ;
import java.util.*;
public class Bankdetail{
	int bank_id ;
	string bank_name;
	string branch;    //take input 
	Scanner obj = new Scanner(System.in);
	public void input(){
	bank_id = obj.nextInt();
	bank_name = obj.next();
	branch = obj.next();
}
public void display(){
	System.out.println(bank_id);
	System.out.println(bank_name);
	System.out.println(branch);
}
}