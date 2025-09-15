import java.util.Scanner;
import java.util.ArrayList;

public class Exer8L4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        ArrayList<Integer> vetor3 = new ArrayList<>();

        // Leitura do primeiro vetor
        System.out.println("Digite 10 números para o primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            vetor1[i] = sc.nextInt();
        }

        // Leitura do segundo vetor
        System.out.println("\nDigite 10 números para o segundo vetor:");
        for (int i = 0; i < 10; i++) {
            vetor2[i] = sc.nextInt();
        }

        // Encontrar interseção sem repetições
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (vetor1[i] == vetor2[j] && !vetor3.contains(vetor1[i])) {
                    vetor3.add(vetor1[i]);
                }
            }
        }

        // Exibir resultado
        System.out.println("\nVetor resultante (interseção sem repetições):");
        if (vetor3.isEmpty()) {
            System.out.println("Nenhum elemento em comum.");
        } else {
            for (int num : vetor3) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}