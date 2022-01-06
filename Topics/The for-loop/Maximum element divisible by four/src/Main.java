import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int nbElts = scanner.nextInt();
        int maxElt = 0;
        int nextElt;
        final int four = 4;

        for (int i = 0; i < nbElts; i++) {
            nextElt = scanner.nextInt();
            if (nextElt % four == 0 && nextElt > maxElt) {
                maxElt = nextElt;
            }
        }
        System.out.println(maxElt);
    }
}