import java.util.Scanner;
import java.util.Arrays;
public class BPrintWithStar {
    public static void main(String[] args) {
        String[][] star = new String[7][4];

        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                if (i == 0 || i == 3 || i == 6) {
                    star[i][j] = " *";
                } else if (j == 0 || j == 3) {
                    star[i][j] = " *";
                } else {
                    star[i][j] = "  ";
                }
            }
        }

        System.out.println("B : " );
        for (String[] i: star) {
            for (String a: i) {
                System.out.print(a);
            }
            System.out.println();
        }
    }
}