import java.util.Scanner;

public class Exer7L4 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int[] VAR1 = new int[5];
        int[] VAR2 = new int[5];
        int[] VAR3 = new int[10];

        for(int I = 0 ; I < 5 ; I++)
        {
            System.out.println("Digite o " + (I + 1) + "° número do primeiro Vetor.");
            VAR1[I] = leia.nextInt();
        }

        System.out.println("\n\n\n");

        for(int I = 0 ; I < 5 ; I++)
        {
            System.out.println("Digite o " + (I + 1) + "° número do segundo Vetor.");
            VAR2[I] = leia.nextInt();
        }

        int I1 = 0 ; int I2 = 0;

        for(int I = 0 ; I < 10 ; I++)
        {

            if(I % 2 == 0)
            {
                VAR3[I] = VAR1[I1]; I1++;
            }

            else
            {
                VAR3[I] = VAR2[I2]; I2++;
            }

        }

        System.out.println("\n\n\n");

        for(int I = 0 ; I < 10 ; I++)
        {
            System.out.println(VAR3[I] + " ");
        }







    }

}
