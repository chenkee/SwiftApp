import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number to generate Fibonacci and FizzBuzz: ");
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		FizzBuzz myfb = new FizzBuzz();
		myfb.printFizzBuzz(n);

	}
	public void printFizzBuzz(int n){

		if(n<=0){
			System.out.println("");
		}
		else if(n==1){
			System.out.println(1);
		}
		else if(n==2){
			System.out.println(1);
			System.out.println(1);
		}
		else{

			System.out.println(1);
			System.out.println(1);
			int[] fib = new int[n];
			fib[0]=1;
			fib[1]=1;
			for(int i = 2;i<n;i++){
				fib[i]=fib[i-1]+fib[i-2]; //generate fibonacci array
				//check the current fibonacci element for prime, divisible by 3, 5, or 15
				if(fib[i]%15==0){
					System.out.println("FizzBuzz");
				}
				else if(isPrime(fib[i])){
					System.out.println("Prime");
				}
				else if(fib[i]%3==0){
					System.out.println("Buzz");
				}
				else if(fib[i]%5==0){
					System.out.println("Fizz");
				}
				else{
					System.out.println(fib[i]);
				}
			}
		}
		
	}
	
	//helper function to determine if a number is prime
	public static boolean isPrime(int n){
		if(n==2) return true;
	    if (n%2==0) return false;
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}

}
