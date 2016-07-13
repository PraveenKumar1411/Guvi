
public class SignFinder {
	public static void main(String args[]){
		if(args.length!=0){
			int a=Integer.parseInt(args[0]);
			{
				if(a>0){
					System.out.println("The gien number is positive");
				}
				else if(a<0){
					System.out.println("The given number is negative");
				}
				else{
					System.out.println("The given number is neither positive nor negative");
				}
			}
			
			}
		else{
			System.out.println("Enter an Integer value");
		}
	}

}
