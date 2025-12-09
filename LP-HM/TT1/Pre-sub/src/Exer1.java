import java.util.Random;

public class Exer1 {

    void main(){

        Random gera =new Random();

        int[][] MAT = new int[5][5];
        int I, J;

        for(I = 0 ; I < 5; I++)
        {
            for(J = 0 ; J < 5; J++)
            {
                MAT[I][J] = gera.nextInt();
            }
        }



        for(I = 0 ; I < 5; I++) {
            for (J = 0; J < 5; J++) {
                if ((I - 1) >= 0) {

                    if (MAT[I - 1][J] >= MAT[I][J]) {

                       boolean ePico = false;

                    }

                }
            }
        }



    }
}


/*

// Vetores de direção (Deltas)
// Ordem:         NO,  N, NE,  O,  L, SO,  S, SE
int[] dLinha  = {-1, -1, -1,  0,  0,  1,  1,  1};
int[] dColuna = {-1,  0,  1, -1,  1, -1,  0,  1};


 */