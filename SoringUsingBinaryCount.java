package pro;
import java.util.*;
public class BinaryAscending {

	public static void main(String[] args) {
		System.out.println("Enter the size of array:");
		Scanner in=new Scanner(System.in);
		int size=in.nextInt();
		String []bin=new String[size];
		int []arr=new int[size];
		System.out.println("Enter the elements of array:");
		for(int i=0;i<size;i++){
			arr[i]=in.nextInt();
			bin[i]=Integer.toBinaryString(arr[i]);
		}
		/*for(String s:bin){
			System.out.println(s);
		}*/
		int count[]=new int[size];
		for(int i=0;i<bin.length;i++){
			char ch[]=bin[i].toCharArray();
			int counter=0;
			for(int j=0;j<ch.length;j++){
				if(ch[j]=='1'){
					counter++;
				}
				else{
					continue;
				}
			}
			count[i]=counter;
		}
		/*for(int k:count){
			System.out.print(k+" ");
		}*/
		System.out.println();
		for(int i=0;i<count.length;i++){
			int temp=0;
			int swap=0;
			for(int j=i+1;j<count.length;j++){
				if(count[i]<count[j]){
					temp=count[i];
					swap=arr[i];
					count[i]=count[j];
					arr[i]=arr[j];
					count[j]=temp;
					arr[j]=swap;
				}
				else if(count[i]==count[j]){
					temp=0;
					if(arr[i]<arr[j]){
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
		for(int a:arr){
			System.out.print(a+" ");
		}
		
		
  }
}
