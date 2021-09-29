import java.util.Scanner;
import java.util.Random;
public class Laborator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContBancar cb = new ContBancar(500);
        cb.depozitareSuma(300);
        System.out.println(cb.interogareSold());
        Random rnd = new Random();
        int N = rnd.nextInt(0,1000);
        System.out.println(N);
        for (int i = 0; i <= N; ++i)
        {
            int n = rnd.nextInt(0,100);
            if(n>=50)
            {
                cb.depozitareSuma(n);
            }
            else System.out.println(cb.interogareSold());
        }
        Masina car = new Masina();
        car.setCuloare("rosu");
        System.out.println(car.getCuloare());
        System.out.println(car.toString());
        N = sc.nextInt();
        Masina[] masini = new Masina[N];
        for (int i = 0; i <N; ++i)
        {
            masini[i]= new Masina();
        }
    }
}
