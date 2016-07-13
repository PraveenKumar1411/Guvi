import java.util.Scanner;
public class Reversing_Number {

	public static void main(String[] args) {
		System.out.println("Enter the value:");
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		in.close();
		int rmd=0, rev=0;
		int temp=a;
		while(a>0){
			rmd=a%10;
			rev=rev*10+rmd;
			a=a/10;
		}
		System.out.println(rev);

	}

}
