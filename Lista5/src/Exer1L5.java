import java.util.Scanner;

public class Exer1L5 {
    public static void main(String[] args) {


        int[][] MAT = new int[3][3];

        Scanner leia = new Scanner(System.in);

        for(int I = 0 ; I < MAT.length ; I++){
            System.out.println("Informe o valor da linha " + (I + 1));

            for(int J = 0 ; J < MAT[I].length ; J++){
                System.out.println("Informe o valor da coluna " + (J + 1));
                MAT[I][J] = leia.nextInt();

            }
        }

        for(int I = 0 ; I < MAT.length ; I++){
            for(int J = 0 ; J < MAT[I].length ; J++){

                System.out.print(MAT[I][J] + " ");

            }



        }


    }
}