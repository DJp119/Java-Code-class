// code for constuctor overloading
class Box1{
double r;
Box1(double r){
this.r=r;
}
double volume() {return (4/3)*(r*r*r);}
}
class Inclass {
public static void main(String args[]){
	Box1 a1 = new Box1(3);
	double x1 = a1.volume();
	System.out.println(x1);
}
}
