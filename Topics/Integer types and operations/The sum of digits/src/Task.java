import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        final int ten = 10;
        int threeDigits = scanner.nextInt();
        int result = threeDigits % ten; // Get units
        threeDigits = (threeDigits - result) / ten;
        result += threeDigits % ten; // Get tens
        result += threeDigits / ten; // Get hundreds
        System.out.format("%d", result);
    }
}