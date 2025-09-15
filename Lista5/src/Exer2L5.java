import java.util.Scanner;

public class Exer2L5 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int[][] MAT = new int[3][3];
        int SOMA;

        for(int I = 0 ; I < MAT.length ; I++){
            System.out.println("Informe o valor da linha " + (I + 1));

            for(int J = 0 ; J < MAT[I].length ; J++){
                System.out.println("Informe o valor da coluna " + (J + 1));
                MAT[I][J] = leia.nextInt();

            }
        }

        for(int I = 0 ; I < MAT.length ; I++){
            SOMA = 0;

            for(int J = 0 ; J < MAT[I].length ; J++){
                SOMA += MAT[I][J];

            }

            System.out.println("\nA soma dos valores da linha " + (I + 1) + " é: " + SOMA);

        }


    }
}
