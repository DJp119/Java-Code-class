class Box{
	double width,height,depth;
	void volume(double w,double h,double d){
//	 width = w ;
//	height = h ;
//	depth = d;
	System.out.print("Volume is ");
//	System.out.println(width*height*depth);
System.out.println(w*h*d);
}
}
class BoxDemo {
public static void main(String args[]){
		Box x1 = new Box();
		x1.volume(3.2,33.2,34.2);
}
}