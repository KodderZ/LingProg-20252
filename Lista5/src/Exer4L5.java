public class Exer4L5 {

    public static void main(String[] args) {

        int[][] MAT = new int[4][4];

        for(int I = 0 ; I  < 4 ; I++)
        {
            for(int J = 0 ; J < 4 ; J++)
            {
                if(I == J)
                {
                    MAT[I][J] = 1;
                }
                else
                {
                    MAT[I][J] = 0;
                }
            }
        }

        for(int I = 0 ; I  < 4 ; I++)
        {
            for (int J = 0; J < 4 ; J++)
            {

                System.out.print(MAT[I][J]);

            }
            System.out.println("");
        }



    }
}
