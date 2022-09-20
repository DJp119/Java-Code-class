import java.util.*;
class First{
int a,b,c;
Scanner sc = new Scanner(System.in);
a = sc.nextInt();
b = sc.nextInt();
void main()
{ c = a + b ;
	System.out.println(c);
}
}
class Second
{	
public static void main(String args[]){
		First obj = new First();
		obj.add();
}
}