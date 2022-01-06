import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int begInt = scanner.nextInt();
        int endInt = scanner.nextInt();
        final int three = 3;
        final int five = 5;
        for (; begInt <= endInt; begInt++) {
            System.out.println(begInt % three == 0
                    ? begInt % five == 0 ? "FizzBuzz" : "Fizz"
                    : begInt % five == 0 ? "Buzz" : begInt);
        }
    }
}