import java.util.Scanner;
public class No_Of_Vowels {

	public static void main(String[] args) {
		System.out.println("Enter the input:");
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		int count=0;
		char c[]=str.toCharArray();
		char vowel[]={'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
		for(int i=0;i<c.length;i++){
			for(int j=0;j<vowel.length;j++){
				if(c[i]==vowel[j]){
					count++;
				}
				else{
					continue;
				}
			}
			
		}
		System.out.println(count);

	}

}
