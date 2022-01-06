import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String room1 = scanner.nextLine();
        String room2 = scanner.nextLine();
        String room3 = scanner.nextLine();
        String room4 = scanner.nextLine();

        String[] room1Array = room1.split(" ");
        String[] room2Array = room2.split(" ");
        String[] room3Array = room3.split(" ");
        String[] room4Array = room4.split(" ");

        int room1NumberGuests = room1Array.length;
        int room2NumberGuests = room2Array.length;
        int room3NumberGuests = room3Array.length;
        int room4NumberGuests = room4Array.length;

        for (int i = room4NumberGuests; i > 0; i--) {
            System.out.println(room4Array[i - 1]);
        }
        for (int i = room3NumberGuests; i > 0; i--) {
            System.out.println(room3Array[i - 1]);
        }
        for (int i = room2NumberGuests; i > 0; i--) {
            System.out.println(room2Array[i - 1]);
        }
        for (int i = room1NumberGuests; i > 0; i--) {
            System.out.println(room1Array[i - 1]);
        }

    }
}