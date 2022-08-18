import java.util.Arrays;
import java.util.Scanner;

class SortAlgorithmsTest {
    public static void main(String[] args) {
        bubbleSort();


    }

    public static void bubbleSort() {
        int[] intArray = {9,4,6,2,7,8,9,1};

        for (int lastSortIndex = intArray.length -1; lastSortIndex > 0; lastSortIndex --) {
            for  (int i = 0; i < lastSortIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(i, i + 1, intArray);
                }
            }
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("item: " + i + ": " + intArray[i]);
        }
    }

    public static void swap(int i, int j, int[] array ) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}