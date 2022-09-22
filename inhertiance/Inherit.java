class A {
int i = 10 , j = 20 ;
void xyz(){
System.out.println(i+j);
}
void lmn(){
		System.out.println("lmn");
}
}
class B extends A {
int k = 40 , j = 45 ;
void abc(){
		System.out.println(i+j+k);
		lmn();
}
}
class C extends B {}
class Inherit {
	public static void main(String args[]){
	C a1 = new C();
	a1.abc();
}
}
