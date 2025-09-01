import java.util.Scanner;

public class Exer2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int CONT = 0, CONTC = 0, clientes = 1;
        float valor = 0, soma = 0;
        String prox = "A";

        do {
            System.out.println("Digite o valor da " + (CONTC + 1) + "° compra do " + clientes + "° cliente:               [Digite um valor negativo para finalizar]");
            valor = sc.nextFloat();

        if (valor > -1) {

            soma = soma + valor;

            System.out.println("Próximo cliente?\n[S] Sim\n[N] Não\n[F] Finalizar");
            prox = sc.next();

            if ((prox.equals("S")) || (prox.equals("s"))) {
                clientes++;
                CONTC = 0;
            }
            if ((prox.equals("N")) || (prox.equals("n"))) {
                CONTC++;
            }

            CONT++;

        }


        } while((valor >= 0) && (!prox.equals("F")) && (!prox.equals("f")));

        System.out.println("Foram atentdidos " + clientes + " clientes, com a venda de " + CONT + " pedidos.\nIsso totalizou uma soma de R$" + soma);


    }
}