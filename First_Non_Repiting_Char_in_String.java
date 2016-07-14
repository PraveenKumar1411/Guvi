import java.util.Scanner;
public class First_Non_Repiting_Char_in_String {
	public static void main(String args[]){
		System.out.println("Enter a String:");
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		in.close();
		char c[]=str.toCharArray();
		char non=c[0];
		int count=0;
		System.out.println("The First Non Repiting Char in the given String: ");
		for(int i=1;i<c.length;i++){
			if(non==c[i]){
				c[i]='@';
				count++;
			}
			else{
				continue;
			}
			
			}
		if(count>0){
			c[0]='@';
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
