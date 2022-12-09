import java.util.Scanner;
public class ebobekok {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i=1,ebob=1,ekok=1,k=1;
        System.out.print("n1 sayısını giriniz : ");
        int n1=scan.nextInt();
        System.out.print("n2 sayısını giriniz : ");
        int n2= scan.nextInt();
        //EBOB
        while(i<=n1 && i<=n2){
            if(n1 % i == 0 && n2 % i == 0 ){
                ebob=i;
                }i++;
                }
        System.out.println("EBOB : "+ ebob);
        //EKOK
        while(k <= n1 * n2){
            if(k % n1==0 && k % n2==0){
                ekok=k;
                break;
            }k++;
        }
        System.out.println("EKOK :" + ekok);



    }

                }









