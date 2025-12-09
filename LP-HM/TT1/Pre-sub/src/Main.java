import java.util.Random;

void main() {


    Scanner leia = new Scanner(System.in);
    Random gera = new Random();

    int[][] MAT = new int[5][5];

    int I, J;

    for (I = 0; I < 5 ; I++)
    {
        for (J = 0 ; J < 5 ; J++)
        {
                MAT[I][J] = gera.nextInt(1, 25);
        }
    }


    for(I = 0 ; I  < 5 ; I++)
    {
        for (J = 0; J < 5 ; J++)
        {

            System.out.print(MAT[I][J] + "  ");

        }
        System.out.println("");
    }

    }

//Para Diagonal: I + 1 e J + 1

    /*Para Diagonal Secundária:

    NxN (Matriz)

    int I, J;

    for(I = 0 ; I < N ; I++)
    {
        for(J = 0 ; J < N ; J++)
        {
            if(I + J == N - 1)
            {
            SOMA = SOMA + Matriz[I][J];
            }
        }
    }

    OU

    for(I = 0 ; I < N ; I++)
    {
    SOMA = SOMA + Matriz[I][(N - 1) - I]
    }

&& (E / AND): Retorna true apenas se todas as condições forem true. Possui "curto-circuito": se a primeira condição for false, a segunda nem é avaliada.
Ex: (idade > 18 && temCarteira).

|| (OU / OR): Retorna true se pelo menos uma das condições for true. Também tem "curto-circuito": se a primeira condição for true, a segunda nem é avaliada.
Ex: (nota >= 7 || presença == 'A').

! (NÃO / NOT): Inverte o valor booleano de uma expressão (converte true para false e vice-versa).
Ex: !(idade < 18).



     */