class Base{
int a = 4 , b = 5 , c ;
void add(){
c = a+b ;
System.out.println(c);
}
}
class Derived1 extends Base{
void sub(){
c = b-a ;
	System.out.println(c);
}
}
class Derived2 extends Derived1{
public void mul(){
c = a*b;
System.out.println(c);
}
}
class Maindemo {
public static void main(String args[]){
Derived2 obj = new Derived2();
obj.add();
obj.sub();
obj.mul();
}}