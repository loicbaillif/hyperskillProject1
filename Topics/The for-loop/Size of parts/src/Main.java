import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int nbParts = scanner.nextInt();
        final int largerPart = 1;
        final int perfectPart = 0;
        int nbLarger = 0;
        int nbPerfect = 0;
        int newPart;
        for (int i = 0; i < nbParts; i++) {
            newPart = scanner.nextInt();
            if (newPart == largerPart) {
                nbLarger++;
            } else if (newPart == perfectPart) {
                nbPerfect++;
            }
        }
        System.out.print(nbPerfect + " " + nbLarger + " ");
        System.out.print(nbParts - nbLarger - nbPerfect);
    }
}