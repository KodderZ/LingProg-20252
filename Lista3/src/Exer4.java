import java.util.Scanner;

public class Exer4 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int NMR, I , MULT = 0;

        System.out.println("Digite um número para ser multiplicado:");
        NMR = leia.nextInt();

        for(I = 1 ; I <= 10 ; I++)
        {
            MULT = NMR * I;
            System.out.println(NMR + " x " + I + " = " + MULT);
        }



    }
}
