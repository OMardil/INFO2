package app;

public class App {
    public static void main(String[] args) throws Exception {

        int[] array = refreshArray(100000000,1000);
        long tiempoInicial = System.nanoTime();
        mergeSort(array);
        long tiempoFinal = System.nanoTime();

        System.out.println((tiempoFinal - tiempoInicial) * Math.pow(10,-9));    

    }


    public static int[] refreshArray(int count, int max){
        int[] data = new int[count];
        
        for(int i=0; i<data.length; i++){
            data[i] = (int)Math.floor(Math.random() * Math.floor(max));
        }

        return data;
    }

    /**
     * Precondition: Every indexed variable of the array a has a value.
     * Postcondition: a[0] <= a[1] <= ... <= a[a.length - 1].
     */
    public static void mergeSort(int[] a) {
        if (a.length >= 2) {
            int halfLength = a.length / 2;
            int[] firstHalf = new int[halfLength];
            int[] lastHalf = new int[a.length - halfLength];
            divide(a, firstHalf, lastHalf);
            mergeSort(firstHalf);
            mergeSort(lastHalf);
            merge(a, firstHalf, lastHalf);
        }
        // else do nothing. a.length == 1, so a is sorted.
    }

    // Precondition: a.length = firstHalf.length + lastHalf.length.
    // Postcondition: All the elements of a are divided
    // between the arrays firstHalf and lastHalf.
    private static void divide(int[] a, int[] firstHalf, int[] lastHalf) {
        for (int i = 0; i < firstHalf.length; i++)
            firstHalf[i] = a[i];
        for (int i = 0; i < lastHalf.length; i++)
            lastHalf[i] = a[firstHalf.length + i];
    }

    // Precondition: Arrays firstHalf and lastHalf are sorted from
    // smallest to largest; a.length = firstHalf.length +
    // lastHalf.length.
    // Postcondition: Array a contains all the values from firstHalf
    // and lastHalf and is sorted from smallest to largest.
    private static void merge(int[] a, int[] firstHalf, int[] lastHalf) {
        int firstHalfIndex = 0, lastHalfIndex = 0, aIndex = 0;
        while ((firstHalfIndex < firstHalf.length) && (lastHalfIndex < lastHalf.length)) {
            if (firstHalf[firstHalfIndex] < lastHalf[lastHalfIndex]) {
                a[aIndex] = firstHalf[firstHalfIndex];
                firstHalfIndex++;
            } else {
                a[aIndex] = lastHalf[lastHalfIndex];
                lastHalfIndex++;
            }
            aIndex++;
        }
        // At least one of firstHalf and lastHalf has been
        // completely copied to a.
        // Copy rest of firstHalf, if any.
        while (firstHalfIndex < firstHalf.length) {
            a[aIndex] = firstHalf[firstHalfIndex];
            aIndex++;
            firstHalfIndex++;
        }
        // Copy rest of lastHalf, if any.
        while (lastHalfIndex < lastHalf.length) {
            a[aIndex] = lastHalf[lastHalfIndex];
            aIndex++;
            lastHalfIndex++;
        }
    }

    //Selection Sort
    public static void bubbleSort(int[] array){

        //check valid input array
        if (array == null)
            return;

        boolean flagSwap = true;

        //Iterate over every position, trying to find the smallest element and 
        // put it on index i
        for(int i = 0; i<array.length-1 && flagSwap; i++){
            flagSwap = false;

            //Well begin our internal loop on i+1, since min was alreay initated with i
            for(int j=0; j<array.length-1-i; j++){
                //Swap the contents of array[j] with array[j+1]
                if (array[j+1] < array[j]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                    flagSwap = true;
                }
            }
        }
    }       
}