import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int nbDays = scanner.nextInt();
        int foodPerDayCost = scanner.nextInt();
        int oneWayFlyCost = scanner.nextInt();
        int oneNightCost = scanner.nextInt();
        int nbNights = nbDays - 1;

        int result = foodPerDayCost * nbDays + oneWayFlyCost * 2;
        result += oneNightCost * nbNights;

        System.out.format("%d", result);
    }
}