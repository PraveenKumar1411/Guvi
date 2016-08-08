package pro;

import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {

		System.out.println("Enter the string:");
		Scanner in=new Scanner(System.in);
		String str1=in.nextLine();
		String str2="The given string is a pangram string";
		if(str1.length()<26){
			System.out.println("The given string is not a pangram string....");
		}
		else {
			for(char c='a';c<='z';c++){
				if((str1.indexOf(c)<0)&& (str1.indexOf((char)c-32)<0)){
					str2="The given String is not a pangram string...";
					break;
				}
			}
			System.out.println(str2);
		}
	}

}
