import java.util.Scanner;

public class Exer5L4 {

    public static void main(String[] args) {

        String[] NMS = new String[10];
        float[] MDS = new float[10];

        Scanner leia = new Scanner(System.in);

        for(int I = 0 ; I < 10 ; I++)
        {
            System.out.println("informe o nome do aluno");
            NMS[I] = leia.nextLine();

            System.out.println("informe as notas do aluno");
            MDS[I] = leia.nextFloat();
        }


    }
}