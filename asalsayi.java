import java.util.Scanner;

public class asalsayi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        for(int i=2;i<=100;i++){
            boolean asal=true;
            for (int j=2;j<i;j++){
                if(i % j==0){
                    asal=false;
                }
            }if(asal){
                System.out.println(i+" ");
            }
        }
        }
    }









