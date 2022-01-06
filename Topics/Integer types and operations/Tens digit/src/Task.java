import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        final int ten = 10;
        int number = scanner.nextInt();
        int result = (number / ten) % ten;
        System.out.format("%d", result);
    }
}