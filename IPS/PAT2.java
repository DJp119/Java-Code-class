import java.util.*;
class A{
	public void area(int x1,int x2){
	float x = x1*x2;
	System.out.println(x);
}
}
class B extends A {
	public void area(int x3,int x4,int x5){
		float x = 
		System.out.println(x);
	}
}
class c extends B {
	public void area(int 6){
		double x  = 3.14*r*r;
	}
}
public class PAT3{
	public static void main(string args[]){
		scanner obj = new Scanner(System.in);
		int a1,a2,a3,a4,a5,a6;
		a1 = obj.nextInt();
		a2 = obj.nextInt();
		a3 = obj.nextInt();
		a4 = obj.nextInt();	
		a5 = obj.nextInt();
		a6 = obj.nextInt();
			
			A obj ;
obj = new A();
obj.area(a1,a2);
obj  = new B();
obj.area(a3,a4,a5);
obj = new C();	
obj.area(a6);	
			
	}
}
