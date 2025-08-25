import java.util.Scanner;

public class EXER1 {

    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);

        System.out.println("\n\nDigite o nome do funcionário:");
        String nome = leia.next();

        System.out.println("\nQuantas horas foram trabalhadas?");
        Float horas = leia.nextFloat();

        System.out.println("\nQual o valor por hora?");
        Float valorhoras = leia.nextFloat();

        float salario = valorhoras * horas;

        System.out.println("\n\nO funcionário " + nome + " trabalhou " + horas + " horas e recebeu R$" + salario);



    }

}
