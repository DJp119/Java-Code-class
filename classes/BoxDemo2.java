class Box{
	double width,height,depth,l;
	double volume(){
 	width = 3.2 ;
	height = 33.2 ;
	depth = 34.2 ;
 l = width*height*depth;
	
	System.out.print("Volume is ");
return (l);
	//System.out.println(width*height*depth);

}}
class BoxDemo2 {
public static void main(String args[]){
		Box x1 = new Box();
		//x1.volume();
		System.out.println(x1.volume());
		
	
}
}