import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int nbElts = scanner.nextInt();
        final int aGrade = 5;
        final int bGrade = 4;
        final int cGrade = 3;
        int nbA = 0;
        int nbB = 0;
        int nbC = 0;
        int nbD = 0;
        int grade;
        for (int i = 0; i < nbElts; i++) {
            grade = scanner.nextInt();
            if (grade == aGrade) {
                nbA++;
            } else if (grade == bGrade) {
                nbB++;
            } else if (grade == cGrade) {
                nbC++;
            } else { // "interested only in passing grades" -> no test needed
                nbD++;
            }
        }

        System.out.format("%d %d %d %d", nbD, nbC, nbB, nbA);
    }
}