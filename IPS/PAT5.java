import java.io.*;
import java.util.*;
interface Info{
    void name();
    void branch();
    void roll_no();
    void mark1();
    void mark2();
    void mark3();
}
class Vit implements Info{
    Scanner obj = new Scanner(System.in);
    int m1,m2,m3;
    String s1,s2,s3;
    public void name(){
        s1 = obj.nextLine();
    }
    public void branch(){
        s2 = obj.nextLine();
    }
    public void roll_no(){
        s3 = obj.nextLine();
    }
    public void mark1(){
    }
    public void mark2(){
    }
    public void mark3(){
    }
    public void print(){
        System.out.println(s1);
        System.out.println(s2);
         System.out.println(s3);
         System.out.println(m1);
         System.out.println(m2);
         System.out.println(m3);
    }
}
class Main{
//    in question we need to take input for name , reg_no , branch , mark123 , print avg according to given condition 
    public static void main(String args[]){
        int n = 3 ; 
        System.out.println("lsb");
        Vit pat = new Vit();
        for(int i = 0 ; i<=n;i++){
        pat.name();
        pat.branch();
        pat.roll_no();
        pat.mark1();
        pat.mark2();
        pat.mark3();
        pat.print();
        System.out.println("number of iteration " +i);
        }
    }
}
