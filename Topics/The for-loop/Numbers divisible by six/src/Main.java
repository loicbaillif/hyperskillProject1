import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int nbElts = scanner.nextInt();
        int nextElt;
        int sum = 0;
        final int divider = 6;

        for (int i = 0; i < nbElts; i++) {
            nextElt = scanner.nextInt();
            if (nextElt % divider == 0) {
                sum += nextElt;
            }
        }
        System.out.println(sum);
    }
}