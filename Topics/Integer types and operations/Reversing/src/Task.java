import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        final int ten = 10;
        final int hundred = 100;
        int threeDigits = scanner.nextInt();
        int threeDigitsUnits = threeDigits % ten;
        int threeDigitsTens = ((threeDigits - threeDigitsUnits) / ten) % ten;
        int threeDigitsCents = threeDigits / hundred;

        int result = threeDigitsUnits * hundred + threeDigitsTens * ten;
        result += threeDigitsCents;

        System.out.println(result);
    }
}