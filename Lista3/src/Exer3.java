
import java.util.Scanner;

public class Exer3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int A, B, C, D, E, AUX;


        System.out.println("Informe o valor de A: ");
        A = entrada.nextInt();
        System.out.println("Informe o valor de B: ");
        B = entrada.nextInt();
        System.out.println("Informe o valor de C: ");
        C = entrada.nextInt();
        System.out.println("Informe o valor de D: ");
        D = entrada.nextInt();
        System.out.println("Informe o valor de E: ");
        E = entrada.nextInt();

        for (int I = 1 ; I <= 4 ; I++)
        {
            if (A > B)
            {
                AUX = A ; A = B; B = AUX;
            }

            if (B > C)
            {
                AUX = B ; B = C ; C = AUX;
            }

            if (C > D)
            {
                AUX = C ; C = D ; D = AUX;
            }

            if (D > E)
            {
                AUX = D ; D = E ; E = AUX;
            }
        }

        System.out.println("Elementos ordenados:" +
                            A + " " + B + " " + C + " " + D + " " + E);


    }
}