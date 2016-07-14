
public class Factorial1 {
	public static void main(String args[]){
		int num=Integer.parseInt(args[0]);
		if(num==0|| num==1){
			System.out.println("The Factorial of the given number is 1");
		}
		else{
			int result=fact(num);
			System.out.println("The factorial of the given number is="+result);
			}
			  
		}

	public static int fact(int n){
		if(n==0){
			return 1;
		}
		else{
			return n*fact(n-1);
	}
	}

}
