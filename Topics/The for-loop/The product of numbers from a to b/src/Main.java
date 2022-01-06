import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int aNum = scanner.nextInt();
        int bNum = scanner.nextInt();
        long product = 1;
        for (; aNum < bNum; product *= aNum++) {
        }
        System.out.print(product);
    }
}