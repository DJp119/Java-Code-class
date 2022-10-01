import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int sum = 0 ;
        word = word.toLowerCase();
        for(int i = 0 ; i < word.length();i++){
            char ch = word.charAt(i);
            for(int j = 0 ; j<word.length();j++){
                if(ch==word.charAt(j))  sum = sum + 1;
            }
        }
        if(sum>word.length()) { System.out.println("Bad"); }
        else { System.out.println("Good"); }
    }
}
