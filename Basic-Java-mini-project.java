// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        float number_1, number_2;
        System.out.println("Enter First Number : ");
        
        Scanner scan = new Scanner(System.in);
        number_1 = scan.nextFloat();
        
        System.out.println("Enter Second Number : ");
        
        Scanner scan2 = new Scanner(System.in);
        number_2 = scan2.nextFloat();
        
        String prompt = "Enter 0 for addition, 1 for subtraction, 2 for multiplication and 3 for division";
        System.out.println(prompt);
        
        int input = scan.nextInt();
        
        switch(input){
            case 0:
                System.out.println("Adding these numbers");
                System.out.println("The result of addition is : " + (number_1+ number_2));
                break;
            case 1:
                System.out.println("Subtracting these numbers");
                System.out.println("The result of subtraction is : " + (number_1 - number_2));
                break;
            case 2:
                System.out.println("Multiplying these numbers");
                System.out.println("The result of multiplication is : " + (number_1*number_2));
                break;
            case 3:
                System.out.println("Dividing these numbers");
                System.out.println("The result of division is : " + (number_1/ number_2));
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
