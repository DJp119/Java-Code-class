class Box{
double width;
double height;
double depth;
Box(){
System.out.println("Constructing Box");
width = 10 ; height = 10 ; depth = 10 ; 
}
double volume(){
return width*height*depth;
}
}
class First{  
public static void main(String args[]){
Box b1 = new Box();
double x1=b1.volume();
System.out.println("Volume is "+x1);
}
}