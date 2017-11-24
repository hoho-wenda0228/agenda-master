import java.io.*;
import java.util.*;

public class Beatles2 {
    public static void main(String[] args) {
        String[] members = new String[4];
        try {
            int divisor = (int) (Math.random() * 2);
            members[0] = "John Lennon";
            double x = 1 / divisor;
            members[2] = "Paul McCartney";
            members[1] = "Ringo Starr";
            members[4] = "George Martin";
            members[3] = "George Harrison";
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Only four Beatles");
        } catch (ArithmeticException exc) {
            System.out.println("Divide by zero");
        }
        for (int i = 0; i < members.length; i++) {
            System.out.println(members[i]);
        }

    }
}
