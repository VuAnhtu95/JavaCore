import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Fibonacci numbers you want?");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n){
        int f0 = 0;
        int f1 = 1;
        int result = 1;

        if (n <= 1) {
            return n;
        }else{
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = result;
                result = f0 + f1;
            }
            return result;
        }
    }
}
