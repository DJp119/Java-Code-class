// code for constuctor overloading
class Box{
double width,heigth,depth;
Box(double w , double h , double d){ // parameterised
	width = w ; heigth = h ; depth = d ;
}
Box(){
width = -1; heigth = -1 ; depth = -1 ;
}
Box(double len){
width = heigth = depth = len;
}
double volume() {return width*heigth*depth;}
}
class MainBox {
public static void main(String args[]){
	Box a1 = new Box();
	Box a2 = new Box(5.0,6.0,7.0);
	Box a3 = new Box(5.6);
	double x1 = a3.volume();
	System.out.println(x1);
}
}
