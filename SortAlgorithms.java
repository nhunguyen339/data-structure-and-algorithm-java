public class SortAlgorithms {
    public static void main(String[] args) {
//        bubbleSort();
//        selectionSort();
//        insertionSort();
            shellSort();
    }

    // swap largest to sort partion
    public static void bubbleSort() {
        int[] intArray = {9,4,6,2,7,8,9,1};

        for (int lastSortIndex = intArray.length -1; lastSortIndex > 0; lastSortIndex --) {
            for  (int i = 0; i < lastSortIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(i, i + 1, intArray);
                }
            }
        }
        printArray(intArray);
    }


    // select largest to swap to sort partion
    public static void selectionSort() {
        int[] intArray = {9,45,2,3,5,-1,-5};

        for (int lastSortIndex = intArray.length - 1; lastSortIndex > 0; lastSortIndex -- ) {
            int largest = 0;

            for (int i = 0; i <= lastSortIndex; i++) {
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }

            swap(lastSortIndex, largest, intArray);
        }

        printArray(intArray);
    }

    public static void swap(int i, int j, int[] array ) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("item: " + i + ": " + array[i]);
        }
    }

    public static void insertionSort() {
        int[] intArray = {9,8,10,3,1,2,3,5,3,7};

        for (int lastUnsortIndex = 0; lastUnsortIndex < intArray.length; lastUnsortIndex ++) {
            int unsortedValue = intArray[lastUnsortIndex];
            int i;
            for (i = lastUnsortIndex; i > 0 && unsortedValue < intArray[i - 1]; i --) {
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = unsortedValue;
        }

        printArray(intArray);
    }

    public static void shellSort() {
        int[] intArray = {9,8,10,3,1,2,3,5,3,7};

        for (int interval = intArray.length / 2; interval > 0 ; interval /= 2) {

            for (int i = interval; i < intArray.length; i++) {
                int temp = intArray[i];

                int j;

                for (j = i; j >= interval && intArray[j - interval] > temp; j -= interval) {
                    intArray[i] = intArray[j - interval];
                }

                intArray[j] = temp;
            }
        }

        printArray(intArray);

    }


}
