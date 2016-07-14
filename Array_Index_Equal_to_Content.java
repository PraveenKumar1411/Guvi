import java.util.Scanner;
public class Array_Index_Equal_to_Content {
	public static void main(String args[]){
		System.out.println("Enter the size of an Array:");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Elements of an Array:");
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		in.close();
		System.out.println("Entered Array is:");
		for(int j=0;j<n;j++){
			System.out.print(arr[j]+" ");
		}
		System.out.println(" ");
		System.out.println("The element(s) which are matching with the Array index is/are:");
		for(int count=0;count<n;count++){
			if(arr[count]==count){
				System.out.print(arr[count]+" ");
			}
			else{
				continue;
			}
		}
	}

}
