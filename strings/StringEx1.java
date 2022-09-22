import java.util.*;
public class StringEx1{
		public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// enter a string
		String str = sc.nextLine();
		int len = 0;		
		int VowCount = 0;
		int ConCount = 0 ;
	//  counting for the words in a sentence 
		int Wordcount = 1;
	for(int i = 0 ; i<str.length();i++){
			if(str.charAt(i)==' '&& str.charAt(i+1)!=' ')  Wordcount++;s
	} 
		
		// counting the vowels and consonent		
		for(int i = 0 ; i<str.length();i++){
			char ch = str.charAt(i);
					
			if(ch =='a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u') VowCount++;
			else 				ConCount++;		
}

} } 