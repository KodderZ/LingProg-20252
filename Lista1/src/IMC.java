import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Inofrme o nome do paciente:");
        String NOME = leia.next();
        System.out.println("\nInforme p peso(KG) do paciente:");
        float PESO = leia.nextFloat();
        System.out.println("\nInforme a altura(metros) do paciente:");
        float ALTURA = leia.nextFloat();

        float IMC = PESO / (ALTURA * ALTURA);

        String classi = "";

        if (IMC < 18.5f)
        {
            classi = "Abaixo do peso.";
        }

        else if(IMC >= 18.5f && IMC < 25f)
        {
            classi = "Peso normal.";
        }

        else if(IMC >= 25f && IMC < 30f)
        {
            classi = "Sobrepeso";
        }

        else if(IMC >= 30)
        {
            classi = "Obesidade.";
        }

        System.out.println("\n\nO paciente " + NOME + " está com um IMC de " + IMC + ". \nClassificação: " + classi);
    }
}
