public class PrimeNumber {
	public static void main(String[] args){
	 int flag=0;
	 if(args.length!=0){
		 int num=Integer.parseInt(args[0]);
		  if(num==0 || num==1){
				 System.out.println("The entered number is neither prime nor composite");
			 }
			 else{
				 
				 for(int i=2;i<=num;i++){
					 if(num%2==0){
						 flag=1;
						 break;
					 }
					 else{
						 flag=0;
					 }
				 }
			 }
				 if(flag==0){
					 System.out.println("The entered number is prime number");
				 }
				 else{
					 System.out.println("The entered number is not a prime number");
				 }
			 }
	 else{
		 System.out.println("Enter an Integer number");
	 }
		 }
	 }



