import java.util.Scanner;

public class Exer3L4 {
    public static void main(String[] args) {

        int[] VET1 = new int[5];
        int[] VET2 = new int[5];

        Scanner leia = new Scanner(System.in);

        for(int I = 0 ; I < 5 ; I++)
        {
            System.out.println("Digite o " + (I + 1) + "° númmero");
            VET1[I] = leia.nextInt();
        }

        for(int I = 0 ; I < 5 ; I++)
        {
            VET2[I] = VET1[I] * 2;
        }

        System.out.println("Vetor original:");
        for(int I = 0 ; I < 5 ; I++)
        {
            System.out.print(VET1[I] + " ");
        }

        System.out.println("Vetor dobrado:");
        for(int I = 0 ; I < 5 ; I++)
        {
            System.out.print(VET2[I] + " ");
        }

    }
}