import java.util.Scanner;
public class Vowel_Or_Consonant {
   public static void main(String args[]){
	   System.out.println("Enter a character:");
	   Scanner in=new Scanner(System.in);
	   int count=0;
	   char c = in.next().charAt(0);
	   char vowel[]={'a', 'e','i', 'o', 'u'};
	   //char array to store the vowels
	   for(int i=0;i<=4;i++){
		   if(c==vowel[i]){
			  
			    count=1;
			   break;
		   }
		   else{
			  
			    count=0;
			   continue;
			   
		   }
	   }
	   if(count==1){
		   System.out.println("The given character is a vowel");
	   }
   
   else{
	   System.out.println("The given character is not a vowel");
   }
}
}
