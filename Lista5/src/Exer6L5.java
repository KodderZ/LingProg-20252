public class Exer6L5 {

    public static void main(String[] args) {

        int[][] MAT = new int[5][5];
        int MAIOR;


        for(int I = 0 ; I  < 5 ; I++)
        {
            for (int J = 0; J < 5 ; J++)
            {

                MAT[I][J] = (int) (Math.random() * 21);

            }
        }

        MAIOR = MAT[0][0];

        int iMAIOR = 0 ; int jMAIOR = 0;

        for(int I = 0 ; I  < MAT.length ; I++)
        {
            for (int J = 0; J < MAT.length ; J++)
            {

                    if(MAT[I][J] > MAIOR)
                    {
                        MAIOR = MAT[I][J] ; iMAIOR = I ; jMAIOR = J;
                    }

            }
        }



        for(int I = 0 ; I  < 5 ; I++)
        {
            for (int J = 0; J < 5 ; J++)
            {

                System.out.print(MAT[I][J]);

            }
            System.out.println("    ");
        }

        System.out.println("Maior elemento " + MAIOR + " na posição [" + iMAIOR + "][" + jMAIOR + "]");


    }
}
