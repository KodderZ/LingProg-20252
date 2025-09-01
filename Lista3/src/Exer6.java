import java.util.Scanner;

public class Exer6 {

    public static void main(String[] args) {


        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número:");
        int NMR = leia.nextInt();

        if(NMR == 0 || NMR == 1)
        {
            System.out.println("O número " + NMR + " não é Primo.");
        }

        boolean PRIM = true;

        for(int I = 2 ; I < NMR ; I++)
        {
            if (NMR % I == 0)
            {
                PRIM = false;
                break; // sai do for
            }

        }

        if (PRIM)
        {
            System.out.println("O número " + NMR + " é Primo.");
        }
        else
        {
            System.out.println("O número " + NMR + " não é Primo.");
        }



    }
}