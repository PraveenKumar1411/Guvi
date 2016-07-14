import java.util.*;
public class String_2_Integer {

	public static void main(String[] args) {
		System.out.println("Enter a String:");
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		int a=Integer.parseInt(str);
		System.out.println("Integer value by converting string: ");
		System.out.println(a);

	}

}
