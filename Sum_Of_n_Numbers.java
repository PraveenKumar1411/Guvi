import java.util.Scanner;
public class Sum_Of_n_Numbers {

	public static void main(String[] args) {
		int sum=0;
		System.out.println("Enter the number");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int i=0;
		for( i=0;i<=n;i++){
			sum=sum+i;
		}
System.out.println("The sum is="+sum);
	}

}
