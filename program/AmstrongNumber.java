import java.util.Scanner;
class AmstrongNumber{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int k = 0 ; // 

	int re=0;
	int temp = num;
	
	// checking for the condition
	for( ;num!=0 ; num/=10){
	 	k = num%10;
		re = re +  k*k*k ;
}
	if(temp==re){
	System.out.println("It is a Amstrong");
}
	else{
	System.out.println("NOT an Amstrong");
}
}
}