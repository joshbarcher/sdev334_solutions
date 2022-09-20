package sorting.basic.sorts;

import sorting.basic.utilities.SortingUtils;

import java.util.Arrays;

public class BasicSorts
{
    public static void bubbleSort(int[] array)
    {
        for (int i = 0; i < array.length - 1; i++)
        {
            //elements after array.length - 1 - i are already sorted
            for (int j = 0; j < array.length - 1 - i; j++)
            {
                if (array[j] > array[j + 1])
                {
                    SortingUtils.swap(array, j, j + 1);
                }
            }
        }
    }

    public static void insertionSort(int[] array)
    {
        // for each element starting with the second element (the first is already sorted)
        for (int i = 1; i < array.length; i++)
        {
            // loop down to the first element swapping the current
            // element with any other elements that are higher than it
            for (int j = i; j >= 1; j--)
            {
                if (array[j] < array[j - 1])
                {
                    SortingUtils.swap(array, j, j - 1);
                }
                else
                {
                    break;
                }
            }
        }
    }

    public static void selectionSort(int[] array)
    {
        // make n selections, where n is array.length
        for (int i = 0; i < array.length; i++)
        {
            int smallest = i;

            // find the next smallest element for index i
            for (int j = i + 1; j < array.length; j++)
            {
                if (array[j] < array[smallest])
                {
                    smallest = j;
                }
            }

            // swap whatever is in index i with the next smallest element
            SortingUtils.swap(array, i, smallest);
        }
    }
}