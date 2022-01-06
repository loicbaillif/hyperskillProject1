import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number1 = Integer.parseInt(scanner.next());
        int number2 = Integer.parseInt(scanner.next());
        int number3 = Integer.parseInt(scanner.next());
        int number4 = Integer.parseInt(scanner.next());

        System.out.format("%d %d %d %d", --number1, --number2, --number3, --number4);

    }
}