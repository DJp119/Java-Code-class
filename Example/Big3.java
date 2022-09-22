import java.util.*;
class Big3{
	public static void main(String[] main){
	Scanner sc = new Scanner(System.in);	
	int a,b,c;
	a = sc.nextInt();
	b = sc.nextInt();
	c = sc.nextInt();
	
	if(a>b){
		if(a>c){
			System.out.println("a is greatest  "+a);
			}
		}	
	else if(b>a){
		if(b>c){
			System.out.println("b is greatest  "+b);
		}
		}
	
	else if(c>a){
		if(c>b){
			System.out.println("c is greatest  "+c);
				}
		}
				
}	
}