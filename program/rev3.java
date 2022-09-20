import java.util.Scanner;
class rev3{
		public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int k = 0 ;
		for(;num!=0;num/=10){
		k = num%10;
		System.out.print(+k);
	
			}
	
}
}	