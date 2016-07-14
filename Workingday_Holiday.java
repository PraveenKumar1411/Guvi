import java.util.Scanner;
public class Workingday_Holiday {

	public static void main(String[] args) {
		System.out.println("Enter a day:");
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		in.close();
		if(str.equalsIgnoreCase("Monday")||str.equalsIgnoreCase("Tuesday")||str.equalsIgnoreCase("Wednesday")||str.equalsIgnoreCase("Thursday")||str.equalsIgnoreCase("Friday")){
			System.out.println("1");
		}
		else if(str.equalsIgnoreCase("Saturday")||str.equalsIgnoreCase("Sunday")){
            System.out.println(0);
	}
		else{
			System.out.println("Invalid Day");
		}

}
}
