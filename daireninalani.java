import java.util.Scanner;

public class daireninalani {
    public static void main(String[] args) {
int r;
double a;
double pi=3.14;
Scanner inp = new Scanner(System.in);

        r= inp.nextInt();
        a=inp.nextInt();
double alan = (pi * (r*r) * a)/360;
double cevre = 2 * pi * r;
        System.out.println("Dairenin Alanı : " + alan);
        System.out.println("Dairenin Çevresi : " + cevre);
    }
}
