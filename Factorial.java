import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter the value:");
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		if(a==1 || a==0){
			System.out.println("Factorial of the given number is=1");
		}
		else{
			System.out.println("Factorial of the given number="+fact(a));
		}
		
		

	}
	public static int fact(int n){
		if(n==0){
			return 1;
		}
		else{
			
		}
		return n*fact(n-1);
	}

}
