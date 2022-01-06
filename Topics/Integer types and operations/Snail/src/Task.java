import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int poleHeight = scanner.nextInt();
        int upPerDay = scanner.nextInt();
        int downPerNight = scanner.nextInt();

        int nbDay = 1;
        int snailHeight = upPerDay;

        while (snailHeight < poleHeight) {
            nbDay += 1;
            snailHeight += -downPerNight + upPerDay;
        }

        System.out.println(nbDay);

    }
}