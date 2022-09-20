import java.util.Scanner;
class LeapYear{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int k  = sc.nextInt();
	if(k%4==0){
	System.out.println("It is leap year " +k);
}
}
}