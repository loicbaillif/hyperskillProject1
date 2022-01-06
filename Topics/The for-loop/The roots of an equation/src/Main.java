import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int aCoef = scanner.nextInt();
        int bCoef = scanner.nextInt();
        int cCoef = scanner.nextInt();
        int dCoef = scanner.nextInt();

        long root;
        byte nbRoots = 0;

        final int thousand = 1000;
        final int maxRoots = 3; // Because cubic equation

        for (int i = 0; i <= thousand; i++) {
            root = ((aCoef * i + bCoef) * i + cCoef) * i + dCoef; // Horner
            if (root == 0) {
                System.out.println(i);
                nbRoots++;
            }
            if (nbRoots == maxRoots) {
                break; // Interrupt the loop if 3 roots found
            }
        }
    }
}