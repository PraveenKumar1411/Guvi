
public class Palindrome {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int reverse=0;
		int rmd;
		int n=num;
		while(num>0){
			rmd=num%10;
			reverse=reverse*10+rmd;
			num=num/10;
		}
		if(reverse==n){
			System.out.println("The given number is a palidrome");
		}
		else{
			System.out.println("The given number is not a palindrome");
		}

	}

}
