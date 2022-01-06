import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int begInt = scanner.nextInt();
        int endInt = scanner.nextInt();
        double sum = 0;

        final int three = 3;
        int nbDividers = 0;
        double average;

        while (begInt % three != 0) {
            begInt++; // Increment beginning interval up to first 3-multiple
        }

        for (; begInt <= endInt; begInt += three) {
            // We can increment 3 by 3 once we found 1st divider
            sum += begInt;
            nbDividers++;
        }
        average = sum / nbDividers;
        System.out.format("%.1f", average);
    }
}