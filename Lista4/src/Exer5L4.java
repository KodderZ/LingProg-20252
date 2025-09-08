import java.util.Scanner;

public class Exer5L4 {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        float[] vetorNotas = new float[10];
        String[] vetorAlunos = new String[10];
        float soma = 0;
        for (int i = 0; i < vetorNotas.length; i++) {
            System.out.println("Digite o nome do " + (i + 1) + "º aluno: ");
            vetorAlunos[i] = entrada.next();
            System.out.println("Digite a nota de " + vetorAlunos[i] + ":");
            vetorNotas[i] = entrada.nextFloat();
            soma += vetorNotas[i];
        }

        float media = soma / 10;

        System.out.println("Alunos acima da média da sala (" + media + "):");
        for (int i = 0; i < vetorNotas.length; i++) {
            if (vetorNotas[i] > media) {
                System.out.println(vetorAlunos[i] + " ficou acima da média | Nota: " + vetorNotas[i]);
            }
        }

    }
}





