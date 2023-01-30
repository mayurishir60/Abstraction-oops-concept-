import java.util.Scanner;

public class AbstractMain {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner (System.in);
		System.out.println(" Value of a is");
		int a = scan.nextInt();
		
		System.out.println(" Value of b is ");
		int b = scan.nextInt();
		
		System.out.println(" Store value of p is " +a);
		System.out.println(" Store value of q is " +b);
		
	// create an object of child class
	
	Abstract_2 child =new Abstract_2();
	
	int result1 = child.add(a, b);
	int result2 = child.sub(a, b);
	
	System.out.println( "Addition is :"+result1);
	System.out.println("substraction is :"+result2);
	
	}
}
