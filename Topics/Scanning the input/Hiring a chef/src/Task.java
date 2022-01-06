import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String chiefName = scanner.next();
        String chiefExp = scanner.next();
        String chiefStyle = scanner.next();

        System.out.format("The form for %s is completed. We will ", chiefName);
        System.out.format("contact you if we need a chef who cooks ");
        System.out.format("%s dishes and has %s ", chiefStyle, chiefExp);
        System.out.format("years of experience.");

    }
}