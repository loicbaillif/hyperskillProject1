import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int startH = scanner.nextInt();
        int startM = scanner.nextInt();
        int startS = scanner.nextInt();
        int endH = scanner.nextInt();
        int endM = scanner.nextInt();
        int endS = scanner.nextInt();

        final int sixty = 60;

        int startJ2000 = (startH * sixty + startM) * sixty + startS;
        int endJ2000 = (endH * sixty + endM) * sixty + endS;

        System.out.print(endJ2000 - startJ2000);
    }
}