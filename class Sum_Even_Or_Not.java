import java.util.Scanner;
public class Sum_Even_Or_Not {

	public static void main(String[] args) {
		System.out.println("Enter a Value:");
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		in.close();
		char c[]=str.toCharArray();
		int sum=0;
		for(int i=0;i<c.length;i++){
			if((int)c[i]%2==0){
				continue;
			}
			else{
				sum=sum+(int)c[i];
				//System.out.println(c[i]);
				//System.out.println(sum);
				
				}
			}
		if(sum%2==0){
			System.out.println(-1);
			//System.out.println(sum);
		}
		else{
			System.out.println(1);
		}
		

	}

}
