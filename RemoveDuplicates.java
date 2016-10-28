import java.util.*;
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;
        int uniqueInd = 0;
        int index = 1;
        int unique = nums[0];
        while (index < nums.length) {
            if (nums[index] != unique) {
                if (uniqueInd < nums.length) {
                    int temp = nums[++uniqueInd];
                    nums[uniqueInd] = nums[index];
                    nums[index] = temp;
                    unique = nums[uniqueInd];
                }
            }
            index++;
        }
        return ++uniqueInd;
    }
}