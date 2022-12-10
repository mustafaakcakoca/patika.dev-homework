import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir Fibonacci Serisi Basamağı Girin : ");
        int n= scan.nextInt();
        int fNumber=0,rNumber=1;
        System.out.println(n+" Sayılı Fibonacci Serisi : ");
        for(int i=0;i<=(n-1);i++){
            System.out.println(fNumber+",");
            rNumber+=fNumber;
            fNumber=rNumber-fNumber;

        }
        }
        }











