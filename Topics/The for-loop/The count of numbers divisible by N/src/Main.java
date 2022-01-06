import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int aInt = scanner.nextInt();
        int bInt = scanner.nextInt();
        int nDivider = scanner.nextInt();

        while (aInt % nDivider != 0) {
            aInt++;
        }

        while (bInt % nDivider != 0) {
            bInt--;
        }

        System.out.println((bInt - aInt) / nDivider + 1);
    }
}