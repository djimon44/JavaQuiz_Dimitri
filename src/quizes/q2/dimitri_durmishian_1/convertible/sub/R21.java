package quizes.q2.dimitri_durmishian_1.convertible.sub;

import quizes.q2.dimitri_durmishian_1.convertible.A21;
import quizes.q2.dimitri_durmishian_1.organic.A22;

public class R21 {
    public static void main(String[] args) {
        // Calculating the area of a rectangle
        int area = A21.hei * A21.len;
        System.out.println("Area of the rectangle is: " + area);

        // Print out the name of the month
        if (A22.month < 1 && A22.month > 12) {
            System.out.println("Invalid");
        } else {
            System.out.println("The name of the month from A22 class is: " + A22.month);
        }
    }
}
