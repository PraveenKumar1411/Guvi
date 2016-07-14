import java.util.Scanner;
public class Deleting_K_Largest_Digits {

	public static void main(String[] args) {
		System.out.println("Enter the value:");
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		System.out.println("Enter the digit k");
		int k=in.nextInt();
		in.close();
		int count=0;
		char c[]=str.toCharArray();	
		for(int i=0;i<k;i++){
			int j=0;
			int largest=c[0];
		for(j=0;j<c.length;j++){
			if(largest<c[j]){
				largest=c[j];
				count=j;
			}
				
			else{
				continue;
			}
			
		
			}
		c[count]=0;
		

					
		}
		for(int i=0;i<c.length;i++){
			if(c[i]!=0){
				System.out.println(c[i]);
			}
			else{
				continue;
			}
		}

	}

}
