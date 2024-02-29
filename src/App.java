import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number you want find factorial?");
        int number = scanner.nextInt();
        System.out.println(checkFactorialOfNumber(number));

    }

    public static long checkFactorialOfNumber(int number){
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}
