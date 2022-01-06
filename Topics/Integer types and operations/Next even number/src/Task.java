import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number = scanner.nextInt();
        int result = number;
        if (number % 2 == 0) {
            result += 2;
        } else {
            result += 1;
        }

        System.out.format("%d", result);

    }
}