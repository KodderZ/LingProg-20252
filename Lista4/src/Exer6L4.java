import java.util.Scanner;

public class Exer6L4 {

    public static void main(String[] args) {

        int[] VET = new int[15];

        int NMR;

        Scanner leia = new Scanner(System.in);

        for(int I = 0 ; I < 15 ; I++)
        {
            VET[I] = (int) (Math.random() * 50);
        }

        System.out.println("Digite um número, entre 0 a 50, a ser buscado no Vetor:");
        NMR = leia.nextInt();

        for(int I = 0 ; I < 15 ; I++)
        {
            if(NMR == VET[I])
            {
                System.out.println("O número " + NMR + " existe no Vetor e está na(s) posição(ões):");


            }

            if(NMR != VET[I])
            {
                System.out.println("O número " + NMR + " não foi encontrado no Vetor.");
            }
        }


    }
}
