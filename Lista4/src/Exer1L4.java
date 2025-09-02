import java.util.Scanner;

public class Exer1L4 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        float SALDO = 1000, NMRL;
        int OPC;

        String[] EXT = new String[1000];

        int IND = 0;

        do {


            System.out.println("\nEscolha uma das opções abaixo:\n");
            System.out.println("[1] Saldo\n[2] Depositar\n[3] Sacar\n[4] Extrato\n[0] Finaizar");
            OPC = leia.nextInt();

            if(OPC > 4 || OPC < 0)
            {

                System.out.println("\n\nOpção inválida!");

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

                    EXT[IND] = "Depósito de R$" + NMRL;
                    IND++;

                    break;

                case 3:
                    System.out.println("\n\nInforme o valor do saque:");
                    NMRL = leia.nextFloat();

                    if (SALDO > NMRL)
                    {
                        SALDO = SALDO - NMRL;

                        System.out.println("\nSaque realizado com sucesso!");

                        EXT[IND] = "Saque de R$" + NMRL;
                        IND++;
                    }

                    else
                    {
                        System.out.println("\nSaldo insuficiente!");
                    }
                    break;

                case 4:

                    System.out.println("\n\n");
                    for(int I = 0 ; I < IND ; I++)
                    {
                        System.out.println(EXT[I]);
                    }

                    System.out.println("\n\n");
                    break;

            }


        }while(OPC != 0);

        System.out.println("\n\n\nPrograma finalizado.");

        }
    }
