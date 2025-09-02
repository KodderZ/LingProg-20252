import java.util.Scanner;

public class Exer2L4 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int[] VET = new int[10];


        for(int I = 0 ; I < VET.length ; I++)
        {
            VET[I] = (int) (Math.random() * 21);
        }


        System.out.println("\nElementos do Vetor:\n");
        for (int I = 0 ; I < VET.length ; I++)
        {
            System.out.println(VET[I] + " ");
        }


    }
}