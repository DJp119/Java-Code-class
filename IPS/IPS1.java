import java.util.*;
public class IPS1{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int p = sc.nextInt();
	int k = 0 ;
	int lav = a ;
	int length = 0 ;
	// calculating the length of number 
	while(a!=0){
	a = a/10;
	length++;
	}
	for(int i = 0 ; i<length-p+1;i++){
			 k = lav%10;
			lav = lav/10 ;
			
				}
	if(k%2==0) System.out.println("It is Even");
	else System.out.println("It is odd");
	
}
}