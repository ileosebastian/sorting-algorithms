package ordenamiento;

public class Insercion extends Thread { // una clase que hereda de la clase Thread7

    int[] array;

    //// public Cronometro(){// Contructor porque la clase es heredada
    //// super();
    //// }

    @Override
    public void run() {
        int n = array.length;
        try {
            long millis1 = System.nanoTime();

            for (int j = 1; j < n; j++) {

                int key = array[j];
                int i = j - 1;
                while ((i > -1) && (array[i] > key)) {

                    array[i + 1] = array[i];
                    i--;
                }
                array[i + 1] = key;

            } // Fin del for infinito

            System.out.println("=====================================================================");

            System.out.print("ORDENAMIENTO INSERCION :");
            for (int x : array) {

                System.out.print(x + "|");

            }
            long millis2 = System.nanoTime();
            System.out.println("");
            System.out.println(
                    "El Tiempo ODERNAMIENTO INSERCION es de milisegundos :" + (millis2 - millis1) / 1e6 + " ms");
            System.out.println("");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());// Imprima el error
        }

    }

    public void InsertoArreglo(int[] array) {
        this.array = array;
    }
}
