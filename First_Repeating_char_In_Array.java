import java.util.Scanner;
public class First_Repeating_char_In_Array {

	public static void main(String[] args) {
		System.out.println("Enter the size of array:");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Elements of array:");
		for(int i=0;i<arr.length;i++){
			arr[i]=in.nextInt();
		}
		in.close();
		int rep=arr[0];
		for(int count=0;count<arr.length;count++){
			rep=arr[count];
		for(int j=count+1;j<arr.length;j++){
			if(rep==arr[j]){
				System.out.println("The First repeating value in the given array="+arr[j]);
				break;
			}
			else{
				continue;
			}
		}
		}

	}

}
