import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int r,a;
        double pi=3.14;

        Scanner log=new Scanner(System.in);
        System.out.println("Dairenin Yaricapini Giriniz: ");
         r=log.nextInt();

        System.out.println("Dairenin Merkez Aci Olcusunu Giriniz: ");
        a=log.nextInt();

        double alan=(pi*(r*r)*a)/360;
        System.out.println("Dairenin Alani: "+alan);
    }
}
