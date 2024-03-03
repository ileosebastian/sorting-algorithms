
package ordenamiento;

public class Mezcla extends Thread { // una clase que hereda de la clase Thread7

    int[] array;

    // public Cronometro(){// Contructor porque la clase es heredada
    // super();
    // }

    @Override
    public void run() {
        // int n = array.length;
        try {
            long millis3 = System.nanoTime();

            Mezcla ob = new Mezcla();
            ob.sort(array, 0, array.length - 1);
            // this.merge(array, n, m, n);

            System.out.println("=====================================================================");

            System.out.println("");
            System.out.print("ORDENAMIENTO MEZCLA : ");
            for (int x : array) {
                System.out.print(x + " ");
            }
            System.out.println("");
            long millis4 = System.nanoTime();
            System.out
                    .println("El Tiempo ODERNAMIENTO MESZLA es de milisegundos :" + (millis4 - millis3) / 1e6 + " ms");
            System.out.println("");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());// Imprima el error
        }

    }

    public void InsertoArreglo(int[] array) {
        this.array = array;
    }

    void merge(int arr[], int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /* Copy data to temp arrays */
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
            // System.out.print("ORDENAMIENTO MEZCLA : ");
            // for( int x:arr){
            // System.out.print(x+" "); }
            // System.out.println(" ");
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;

        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;

        }
    }

    void sort(int arr[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
}
