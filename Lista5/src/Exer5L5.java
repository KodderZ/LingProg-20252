import java.util.Scanner;

public class Exer5L5 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        float[][] NOTAS = new float[3][4];
        String[] NOMES = new String[3];




        for(int I = 0 ; I < 3 ; I++)
        {
            System.out.println("Informe o nome do aluno:");
            NOMES[I] = leia.next();

            System.out.println("\nInforme as 4 notas do aluno:");

            for(int J = 0; J < 4 ; J++)
            {
                NOTAS[I][J] = leia.nextFloat();
            }
        }

        float SOMA = 0;

        for(int I = 0 ; I < 3 ; I++)
        {
            SOMA = 0;

            for(int J = 0; J < 4 ; J++)
            {

                SOMA += NOTAS[I][J];

            }

            System.out.println("A média do aluno " + NOMES[I] + " è " + SOMA / 4);

        }



    }
}
