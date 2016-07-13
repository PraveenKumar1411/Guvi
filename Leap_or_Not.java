import java.util.Scanner;
public class Leap_or_Not {

	public static void main(String[] args) {
		System.out.println("Enter Year:");
		Scanner in=new Scanner(System.in);
		int year=in.nextInt();
		in.close();
		if(year>0){
		if(year%4==0){
			System.out.println("The given year is a leap year");
			
		}
		else{
			System.out.println("The given year is not a leap year");
		}
		}
		else{
			System.out.println("Enter a valid year");
		}
		

	}
