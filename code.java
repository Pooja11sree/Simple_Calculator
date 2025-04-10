package Projects;
import java.util.Scanner;
public class simple_calculator {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter values to perform arithmetic operations : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=0;
		System.out.println("Choose an operator to perform operation : ");
		System.out.println("Addition (+)");
		System.out.println("Subtraction (-) ");
		System.out.println("Multiplication (*)");
		System.out.println("Division (/)");
        char ch=sc.next().charAt(0);
        switch(ch){
        	case '+':
        		c=a+b;
        		break;
        	case '-':
        		c=a-b;
        		break;
        	case '*':
        		c=a*b;
        		break;
        	case '/':
        		if (b != 0) {
                    c = a / b;
                } else {
                    System.out.println("Division by zero is not allowed.");
                    return;
                }
                break;
        	default:
        		System.out.println("enter valid operator : ");
        		return;
        }
        System.out.println("Result : " +c);
	}

}
