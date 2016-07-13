import java.util.Scanner;
public class Alphabet_Or_Not {
	
	   public static void main(String args[]){
		   System.out.println("Enter a character:");
		   Scanner in=new Scanner(System.in);
		   int count=0;
		   char c = in.next().charAt(0);
		   char alphabet[]={'a', 'b','c', 'd', 'e', 'f','g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' }; 
		   for(int i=0;i<=25;i++){
			   if(c==alphabet[i]){
				  
				    count=1;
				   break;
			   }
			   else{
				  
				    count=0;
				   continue;
				   
			   }
		   }
		   if(count==1){
			   System.out.println("The given character is a Alphabet");
		   }
	   
	   else{
		   System.out.println("The given character is not an Alphabet");
	   }
	}
	}


