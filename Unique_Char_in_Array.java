import java.util.Scanner;
public class Unique_Char_in_Array {
	public static void main(String args[]){
			System.out.println("Enter the size of array:");
			Scanner in=new Scanner(System.in);
			int n=in.nextInt();
			int arr[]=new int[n];
			System.out.println("Enter the elements of array:");
			for(int i=0;i<arr.length;i++){
				arr[i]=in.nextInt();
			}
			in.close();
			int non=arr[0];
			int count=0;
			System.out.println("The Unique value in the given Array is: ");
			for(int counting=0;counting<arr.length;counting++){
				count=0;
				non=arr[counting];
			for(int i=counting+1;i<arr.length;i++){
				if(non==arr[i]){
					arr[i]='@';
					count++;
				}
				else{
					continue;
				}
				
				}
			if(count>0){
				arr[counting]='@';
			}
			}
			for(int j=0;j<arr.length;j++){
				if(arr[j]=='@'){
					continue;
				}
				else{
					System.out.println(arr[j]);
					break;
				}
			}
		}

	}
