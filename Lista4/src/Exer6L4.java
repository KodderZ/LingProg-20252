import java.util.Scanner;

public class Exer6L4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[15];
        int busca;
        int cont = 0;
        int indice;
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = entrada.nextInt();
        }

        System.out.println("Digite um número para ser buscado: ");
        busca = entrada.nextInt();
        for (int x = 0; x < vetor.length; x++) {
            if (busca == vetor[x]) {
                indice = x;
                System.out.println("Número encontrado! | Posição: " + indice);
                cont++;

            }
            else if (cont == 15){
                System.out.println("Número não encontrado!");
            }
        }
    }
}
