package sorting.basic.testing;

import sorting.basic.sorts.BasicSorts;
import sorting.basic.utilities.SortingUtils;

import java.util.Arrays;

public class TestSorts
{
    public static void main(String[] args)
    {
        int[] testArray = SortingUtils.genArray(40, 1, 100);
        System.out.println(Arrays.toString(testArray));

        BasicSorts.bubbleSort(testArray);

        System.out.println(Arrays.toString(testArray));
        System.out.println("Inversions? " + SortingUtils.hasInversions(testArray));
    }
}
