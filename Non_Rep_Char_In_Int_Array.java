import java.util.Scanner;

public class Non_Rep_Char_In_Int_Array {
			public static void main(String args[]){
				System.out.println("Enter the size of array:");
				Scanner in=new Scanner(System.in);
				int n=in.nextInt();
				int c[]=new int[n];
				System.out.println("Enter the Elements of array:");
				for(int i=0;i<c.length;i++){
					c[i]=in.nextInt();
				}
				int non=c[0];
				int count=0;
				System.out.println("The First Non Repiting value in the array is: ");
				for(int counting=0;counting<c.length;counting++){
					count=0;
					non=c[counting];
				for(int i=counting+1;i<c.length;i++){
					if(non==c[i]){
						c[i]='@';
						count++;
					}
					else{
						continue;
					}
					
					}
				if(count>0){
					c[counting]='@';
				}
				}
				for(int j=0;j<c.length;j++){
					if(c[j]=='@'){
						continue;
					}
					else{
						System.out.println(c[j]);
						break;
					}
				}
			}

		

	}



