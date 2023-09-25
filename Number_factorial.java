import java.util.Scanner;

public class Number_factorial {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value you want to obtain the factoral (number between 1 and 10 included)");
        int n = input.nextInt();
        input.close();

        if (n<1 || n>10){
            throw new CustomException_OutOfRange("The input value need to be  between 1 and 10");
        }
        
        System.out.println("The factorial of " + n + " is " + factorial(n));
    }
    public static int factorial(int n){
        if (n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }
}
