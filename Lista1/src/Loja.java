import java.util.Scanner;

public class Loja {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);


        System.out.println("Digite o nome do produto:");
        String nomeProduto = leia.nextLine();

        System.out.println("Digite a quantidade comprada:");
        int quantidade = leia.nextInt();

        System.out.println("Digite o preço unitário:");
        float precoUnitario = leia.nextFloat();

        System.out.println("Digite a forma de pagamento (1 - Pix, 2 - Cartão, 3 - Boleto):");
        int formaPagamento = leia.nextInt();


        double subtotal = quantidade * precoUnitario;
        double valorComDesconto = subtotal;
        double desconto = 0;
        double ajuste = 0;
        String FormaPagamento = "";


        if (subtotal >= 300.00)
        {
            desconto = subtotal * 0.10;
            valorComDesconto = subtotal - desconto;
        }

        else if (subtotal >= 100.00)
        {
            desconto = subtotal * 0.05;
            valorComDesconto = subtotal - desconto;
        }


        double totalFinal = valorComDesconto;


        switch (formaPagamento)
        {
            case 1:
                ajuste = valorComDesconto * 0.02;
                totalFinal = valorComDesconto - ajuste;
                FormaPagamento = "Pix";
                break;

            case 2:
                ajuste = valorComDesconto * 0.015;
                totalFinal = valorComDesconto + ajuste;
                FormaPagamento = "Cartão";
                break;

            case 3:
                FormaPagamento = "Boleto";
                break;

            default: System.out.println("Forma de pagamento inválida. Nenhum ajuste aplicado.");
        }

        System.out.println("\n--- Resumo da Compra ---");
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Quantidade: " + quantidade);
        System.out.printf("Subtotal: R$ %.2f%n", subtotal);
        System.out.printf("Desconto aplicado: R$ %.2f%n", desconto);
        System.out.println("Forma de Pagamento: " + FormaPagamento);
        System.out.printf("Ajuste por pagamento: R$ %.2f%n", ajuste);
        System.out.printf("Total Final: R$ %.2f%n", totalFinal);

    }
}