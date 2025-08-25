//Todo programa Java começa definindo uma classe.

import java.util.Scanner;

public class Main {
    //Definição da função main, executadad quando o programa roda.

    public static void main(String[] args)
    {   //Comando dde saída - a função println pertence a classe System.

        System.out.println("\n\n");
        System.out.println("Hello and welcome!");
        System.out.println("LULA NA CADEIA\n\n\n");



    // Java é fortemente tipado (float, char, int, double, boolean)
    // declara variável e atribui valor a ela
    char letra = 'A';
    float nota = 6.5f;
    int idade = 19;
    boolean resposta = true;
    String nome = "Murilo";


    // exibe os dados das variáveis para o usuário
       System.out.println("TESTE\n===============================================================================");
       System.out.println("Nome: " + nome + "\nLetra: " + letra + "\nNota: " + nota + "\nIdade: " + idade + "\nResposta: " +  resposta);
       System.out.println("===============================================================================\n\n\n");


        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma nota: ");
        float nota1 = entrada.nextFloat();

        System.out.println("\n\nDigite uma segunda nota: ");
        float nota2 = entrada.nextFloat();

        System.out.println("\n\nDigite seu nome: ");
        String nomeAluno = entrada.next();

        //calcula a soma das notas
        float soma = nota1 + nota2;
        float media = soma / 2;

        System.out.println("\nO aluno " + nomeAluno + " 5teve uma média de: " + media);



















        System.out.println("\n\n\n\n\n\n\n\n\n\n\n            ⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣶⣶⣦⣤⣀\n" +
                "⠀⠀⠀⠀ ⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡄\n" +
                "⠀⠀ ⠀⠀⢀⣘⣛⣿⣟⣿⡋⠁⣀⣀⠲⠦⡝⢻⣿⣿⠿⠛⠉⠉⢉⣻⣿⣿⣧⣀\n" +
                "⠀ ⠀⣰⡟⣡⣶⠶⣬⣝⣛⣛⣩⣿⣿⣷⣶⣿⣿⣿⡆⢾⣿⣿⠿⠟⣋⣙⣻⣿⠆\n" +
                " ⠀⢿⣇⣿⣅⠰⣦⣍⠛⠿⢿⣿⣿⡍⣼⠛⢿⣿⣿⡆⣉⣻⣿⣿⠏⢻⣿⣿⠁\n" +
                " ⠀⠀⢩⣿⣿⣦⠈⣍⠁⠻⠷⣶⡌⣉⣛⣛⠛⠻⠥⠾⠟⠛⢋⡁⡄⠈⣿⠃\n" +
                "⠀ ⠀⠀⠀⠹⣿⣿⣷⣌⠁⣶⣦⣤⢀⣉⠛⠛⠁⠛⠛⠘⠛⠋⠈⠁⠀⢀⣿\n" +
                "⠀⠀ ⠀⠀⠀⠀⠙⢿⣿⣿⣷⣮⣙⠋⢼⣿⣿⡇⣶⣶⡆⣤⡤⣠⠀⡤⠀⣼⣿\n" +
                "⠀⠀ ⠀⠀⠀⠀⠀⠀⠈⠛⠿⣿⣿⣿⣷⣶⣤⣥⣬⣭⣥⣭⣤⣤⣶⣶⣿⣿⣿⡄\n" +
                "⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠻⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇\n" +
                "⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠛⠛⠻⠿⠿⠿⠿⠿⠛⠁\n");

    }
}
