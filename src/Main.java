import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] bubbleArrayNumbersToSort = {4, 1, 3, 9, 7};
        Bubble_Sort sorter = new Bubble_Sort();
        sorter.sort(bubbleArrayNumbersToSort);
        System.out.println(Arrays.toString(bubbleArrayNumbersToSort));

        Integer[] bubbleArrayNumbersToSort2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Bubble_Sort sorter2 = new Bubble_Sort();
        sorter2.sort(bubbleArrayNumbersToSort2);
        System.out.println(Arrays.toString(bubbleArrayNumbersToSort2));

        Counting_Sort array = new Counting_Sort();
        Character[] arr = {'e', 'd', 's', 'a', 'b',};
        array.countingSort(arr);

        for (Integer i = 0; i < arr.length; ++i) {
            System.out.print(arr[i]);
        }

        System.out.println();

        Counting_Sort array2 = new Counting_Sort();
        Character[] arr2 = {'g', 'e', 'e', 'k', 's', 'f', 'o', 'r', 'g', 'e', 'e', 'k', 's' };

        array2.countingSort(arr2);

        for (Integer i = 0; i < arr2.length; ++i) {
            System.out.print(arr2[i]);
        }

    }
}
