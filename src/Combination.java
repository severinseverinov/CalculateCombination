import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        int n,nFaktorial=1,r,rFaktorial=1,nrFaktorial=1;
        double combination;

        Scanner input=new Scanner(System.in);
        System.out.println("N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı " +
                "farklı grupların sayısı n’in r’li kombinasyonu için;");
        System.out.print("n sayısı : ");
        n=input.nextInt();
        System.out.print("r sayısı : ");
        r=input.nextInt();

        for(int i=1;i<=n;i++){
            nFaktorial*=i;
        }

        for(int i=1;i<=r;i++){
            rFaktorial*=i;
        }

        for(int i=1;i<=(n-r);i++){
        nrFaktorial*=i;
        }

        combination=nFaktorial / (rFaktorial * nrFaktorial);

        System.out.println("C(n,r) = "+combination);

    }
}
