package apples;
import java.util.Scanner;

class apples{
	
	public static void main(String[] args){
		try{
		double a,b,c;
		int choice;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		a = input.nextDouble();
		System.out.println("Enter second number");
		b = input.nextDouble();
		System.out.println("Enter Choice: 1.Additon 2.Substraction 3.Multiply 4.Divide ");
		choice = input.nextInt();
		switch(choice){
		
		case 1 : c = a+b;
		System.out.println("The Sum is "+c);
		break;
		
		case 2: c = a-b;
		System.out.println("The Difference is: "+c);
		break;
		
		case 3 : c = a*b;
		System.out.println("The product is: "+c);
		break;
		
		case 4 : c = a/b;
		System.out.println("The Division is : "+c);
		break;
		
		default: System.out.println("Enter some numbers hoss...");
		break;
		
		   }
		
		}catch(Exception e){
			System.out.println("Invalid input!");
		}
		
	}
	
	
}
