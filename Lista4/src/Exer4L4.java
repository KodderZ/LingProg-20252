public class Exer4L4 {

    public static void main(String[] args) {

        int[] VET = new int[8];

        for(int I = 0 ; I < 8 ; I++)
        {
            VET[I] = (int) (Math.random() * 21);
        }

        int MENOR = VET[0]; int posMENOR = 0;
        int MAIOR = VET[0]; int posMAIOR = 0;

        for(int I = 0 ; I < 8 ; I++)
        {
            if (VET[I] < MENOR)
            {
                MENOR = VET[I];
                posMENOR = I;
            }

            if (VET[I] > MAIOR)
            {
                MAIOR = VET[I];
                posMAIOR = I;
            }
        }

        System.out.println("Maior elemento: " + MAIOR + " na posição: " + posMAIOR);
        System.out.println("Menor elemento: " + MENOR + " na posição: " + posMENOR);

    }
}
