import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        final int one = 1;
        final int two = 2;
        final int three = 3;
        int nVal = scanner.nextInt();
        int result = ((nVal + one) * nVal + two) * nVal + three;
        System.out.format("%d", result);
    }
}