import java.util.Scanner;
public class Sum_Of_Natural_Numbers {

	public static void main(String[] args) {
		System.out.println("Enter the count:");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=1;i<=n;i++){
			System.out.println(i);
			i=i++;
		}

	}

}
