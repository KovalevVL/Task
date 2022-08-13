//Дан массив целых чисел и ещё одно целое число. Удалите все вхождения этого числа из массива

import java.util.Arrays;

public class Number {
    public static void main(String[] args) {
        int test_array[] = {2, 3, 1, 4, 5, 3, 2, 1, 5, 2, 1, 2, 5, 4, 3, 3};
        System.out.println(Arrays.toString(removeElement(test_array, 1)));
    }

    public static int[] removeElement(int[] nums, int val) {
        int offset = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                offset++;
            } else {
                nums[i - offset] = nums[i];
            }
        }
        return Arrays.copyOf(nums, nums.length - offset);
    }
}
