package main.height;

import java.util.Scanner;

public class adultHeight {

    public static int calcHChild(int gender, int hMother, int hFather) {
        return gender == 0 ? ((hMother * 13 / 12) + hFather) / 2 : ((hFather * 12 / 13) + hMother) / 2;
    }

    private static void enterValues() {
        Scanner scanner = new Scanner(System.in);
        int gender;
        int hMotherF;
        int hMotherI;
        int hMother;
        int hFatherF;
        int hFatherI;
        int hFather;
        String nextChoose;
        do {
            System.out.println("Enter the gender of your child. 0 for male, 1 for female");
            gender = scanner.nextInt();
            System.out.println("Enter the height in feet and inches of the mom");
            hMotherF = scanner.nextInt();
            hMotherI = scanner.nextInt();
            hMother = hMotherF * 12 + hMotherI;
            System.out.println("Enter the height in feet and inches of the dad");
            hFatherF = scanner.nextInt();
            hFatherI = scanner.nextInt();
            hFather = hFatherF * 12 + hFatherI;
            System.out.println("your child is astimate to grow to " + calcHChild(gender, hMother, hFather) + " inches");
            System.out.println("Enter 'Y' to try again");
            nextChoose = scanner.next().toUpperCase();
        } while (nextChoose.equals("Y"));
    }

    public static void main(String[] args) {
        enterValues();
    }
}
