package sn.groupAGL.metier;

public class Calculator {
    public int sum( int a, int b ) {

        return a + b;
    }

    public int minus( int a, int b ) {

        return a - b;
    }

    public int divide( int a, int b ) throws Exception {

        if ( b != 0 )
            return a / b;
        else
            throw new Exception( "Division par zero impossible" );
    }

    public int multiply( int a, int b ) {

        return a * b;
    }

    /*
     * Veuillez ajouter ici vos modifications pour les branchDiassy et Mbaye
     */

    public int min( int a, int b ) {

        return Math.min(a, b);
    }

    public int max( int a, int b ) {

        return Math.max(a, b);
    }

    /*
     * Retourne le plus petit élément d'une liste
     */
    public int minElement(int[] list)
    {
        int min=list[list.length-1];
        for(int i=list.length-1;i>1;i--)
        {

            if(min>list[i-1])
            {
                min=list[i-1];
            }
        }
        return min;
    }


    /**
     *  : retourne le plus grand élément d’une liste
     * @param list la liste des valeurs
     * @return
     */
    public int maxElement(int[] list) {
        int max = list[list.length - 1];
        for (int i = list.length - 1; i > 1; i--) {

            if (max < list[i - 1]) {
                max = list[i - 1];
            }
        }
        return max;
    }

}
