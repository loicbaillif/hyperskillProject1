import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        final int classroom1 = scanner.nextInt();
        final int classroom2 = scanner.nextInt();
        final int classroom3 = scanner.nextInt();

        int tablesClass1 = classroom1 / 2 + classroom1 % 2;
        int tablesClass2 = classroom2 / 2 + classroom2 % 2;
        int tablesClass3 = classroom3 / 2 + classroom3 % 2;


        System.out.format("%d", tablesClass1 + tablesClass2 + tablesClass3);

    }
}