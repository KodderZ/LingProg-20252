import java.util.Scanner;

public class Exer5
{

    public static void main(String[] args)
    {

        Scanner leia = new Scanner(System.in);

        System.out.println("Informe uum número N positivo:");
        int NMR = leia.nextInt();

        if (NMR < 0)
        {
            System.out.println("Digite um valor positivo.");
        }
        else
        {
            int SM = 0;
            for(int I = 1 ; I <= NMR ; I++)
            {
                if (I % 2 == 0)
                {
                    SM += I;
                }
            }

            System.out.println("A soma dos números pares é " + SM);

        }




    }
}
