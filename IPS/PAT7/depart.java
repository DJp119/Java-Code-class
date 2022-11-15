package Department  ;

import java.util.*;

abstract class Pat{
	public void run();
	public void display2();
}

 class Depart extends Pat{
	int depid;
	string depName;
	int number ;
	
	Scanner obj = new Scanner(System.in);
	Pat p1 = new Pat();
	public void run(){
	depid = obj.nextInt();
	depName = obj.nextLine();
	number = obj.nextInt();
	}
// function
	public void display2(){
	System.out.println(depid);
	System.out.println(depName);
	System.out.println(number);
}
}