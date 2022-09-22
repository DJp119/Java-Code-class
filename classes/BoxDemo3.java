import java.ut
class Box{
	double width,height,depth,l;
	double volume(double w,double h,double d){
 	width = w ;
	height = h ;
	depth = d ;
 l = width*height*depth;
	
	System.out.print("Volume is ");
return (l);


}}
class BoxDemo3 {
public static void main(String args[]){
		Box x1 = new Box();
		System.out.println(x1.volume(3.2,33.2,34.2));
		
	
}
}