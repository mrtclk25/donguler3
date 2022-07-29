import java.util.Scanner;

public class donguler3 {
    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);

        System.out.println("Sınır Değeri Giriniz");
        n = input.nextInt();

        for (int k = 1 ; k<= n ; k*=4 ){
            System.out.println(k);


        } System.out.println("------------------------------");
        for (int k = 1 ; k<= n ; k*=5 ){
            System.out.println(k);
        }

    }
}
