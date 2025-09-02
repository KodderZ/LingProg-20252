import java.util.Scanner;

public class Exer1L4 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        float SALDO = 1000, NMRL;
        int OPC;
        do {


            System.out.println("\nEscolha uma das opções abaixo:\n");
            System.out.println("[1] Saldo\n[2] Depositar\n[3] Sacar\n[4] Extrato\n[0] Finaizar");
            OPC = leia.nextInt();

            if(OPC > 4 || OPC < 0)
            {

                System.out.println("Opção inválida!");

            }

            switch (OPC)
            {
                case 1:
                    System.out.println("\n\nSaldo atual: " + SALDO);
                    break;

                case 2:
                    System.out.println("\n\nInforme o valor do depósito:");
                    NMRL = leia.nextFloat();
                    SALDO = SALDO + NMRL;

                    System.out.println("\nDepósito realizado com sucesso!");

                    break;

                case 3:
                    System.out.println("\n\nInforme o valor do saque:");
                    NMRL = leia.nextFloat();

                    if (SALDO > NMRL)
                    {
                        SALDO = SALDO - NMRL;

                        System.out.println("Saque realizado com sucesso!");

                    }

                    else
                    {
                        System.out.println("\n\nSaldo insuficiente!");
                    }
                    break;

                case 4:
                    System.out.println("\n\n");
                    break;

            }


        }while(OPC != 0);

        System.out.println("Programa finalizado.");

        }
    }
