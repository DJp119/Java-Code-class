class Box{
	double width,height,depth;
	void volume(){
 	width = 3.2 ;
	height = 33.2 ;
	depth = 34.2 ;
	
	System.out.print("Volume is ");
	System.out.println(width*height*depth);

}}
class BoxDemo1 {
public static void main(String args[]){
		Box x1 = new Box();
		x1.volume();
		// x1.volume(3.2,33.2,34.2);
	
}
}