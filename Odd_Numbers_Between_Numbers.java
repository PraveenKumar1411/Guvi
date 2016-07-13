import java.util.Scanner;
public class Odd_Numbers_Between_Numbers {

	public static void main(String[] args) {
		System.out.println("Enter the values:");
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		if(a>0 &&b>0){
		for(int i=a;i<b;i++){
			if(i%2==1){
				System.out.println(i);
				
			}
			else{
				continue;
			}
		}
		}
		else{
			System.out.println("Enter the valid Numbers:");
			
		}
		
	}

}
