import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();

        String line1NoSpace = line1.replace(" ", "");
        String line2NoSpace = line2.replace(" ", "");

        System.out.println(line1NoSpace.equals(line2NoSpace));
    }
}