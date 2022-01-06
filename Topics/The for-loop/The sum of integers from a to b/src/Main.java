import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int aNum = scanner.nextInt();
        int bNum = scanner.nextInt();
        final int two = 2;
        int sum = (aNum + bNum) * (bNum - aNum + 1) / two;
        System.out.format("%d", sum);
    }
}