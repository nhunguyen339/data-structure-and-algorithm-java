public class SortAlgorithms {
    public static void main(String[] args) {
//        bubbleSort();
        selectionSort();
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

}
