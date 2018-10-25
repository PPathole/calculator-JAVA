
/**
 *
 * @author pathole
 */

import java.util.*;
public class Calculator
{
    public static void main(String[] args) {
        int x=1;
        do {
            try {
                System.out.println("Menu");
                System.out.println("1-Addition");
                System.out.println("2-Subtraction");
                System.out.println("3-Multiplication");
                System.out.println("4-Divison");
                System.out.println("5-Modulos");
                System.out.println("6-Exit");
                System.out.println("Choose option: ");
                Scanner input = new Scanner(System.in);
                int choice;  
                int a,b,c;
                choice = Integer.parseInt(input.nextLine());


                switch (choice) {
                    case 1: 
                        System.out.print("Input two numbers:");
                                a = input.nextInt();
                                b = input.nextInt();
                                c = a + b;
                                System.out.println("Sum = " +c);
                            break;  
                    case 2: 
                        System.out.print("Input two numbers:");
                                    a = input.nextInt();
                                    b = input.nextInt();
                                    c = a - b;
                                    System.out.println("Difference = " +c);
                        break;
                    case 3: 
                        System.out.print("Input two numbers:");
                                    a = input.nextInt();
                                    b = input.nextInt();
                                    c = a * b;
                                    System.out.println("Product = " +c);
                        break;  
                    case 4: 
                        System.out.print("Input two numbers:");
                                    a = input.nextInt();
                                    b = input.nextInt();
                                    c = a / b;
                                    System.out.println("Division = " +c);
                         break;
                    case 5: 
                        System.out.print("Input two numbers:");
                                    a = input.nextInt();
                                    b = input.nextInt();
                                    c = a % b;
                                    System.out.println("Modulus = " +c);
                        break;
                    case 6: 
                        System.out.println("Now exiting program...");
                        break;  
                }
            } catch (Exception e) {
               System.out.println("Wrong input. Try again.");
            }
        } while (x==1);
    } 
}