import java.util.Scanner;

public class dortvebeskat {
    public static void main(String[] args) {
        int n,i=1,a=1;
        Scanner inp=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        n= inp.nextInt();


        System.out.println("\n Result : ");
        while (i<n || a<n){

            if(i<n){
                System.out.println(i);
                i=i*=4;
            if(a<n){

                System.out.println(a);
                a=a*=5;
            }
            }
        }


        }
    }

