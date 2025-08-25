import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int contador = 1;
        float nota, soma = 0, media = 0;

        Scanner leia = new Scanner(System.in);

        while (contador <= 5)
        {
            System.out.println("Informe a " + contador + "° nota.");
            nota = leia.nextFloat();

            soma += nota;

            contador++;
        }

        media = soma / 5;

        System.out.println("A média das notas é " + media);


        }
    }