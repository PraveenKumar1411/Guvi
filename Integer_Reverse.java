import java.util.Scanner;
public class Integer_Reverse {

	public static void main(String[] args) {
		System.out.println("Enter a String:");
		Scanner in=new Scanner(System.in);
	    String str=in.nextLine();
	    char c[]=str.toCharArray();
	    System.out.println("The Reversed String:");
	    for(int i=c.length-1;i>=0;i--){
	    	System.out.print(c[i]);
	    }
			}
		}
		

	


