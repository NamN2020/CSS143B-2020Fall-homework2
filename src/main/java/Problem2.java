/*
    Nam Nguyen
    October 16, 2020
    CS 143B
    Homework_2
 */

public class Problem2 {

    /*
    Describe your algorithm here in up to 5 sentences:
     */

    // Do not change signature (function name, parameters and return type)
    // Do not use extra space for another array. Solution to be in-pace with O(1) extra memory
    public static int remove(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        int count = 1;
        int maxNum = nums[nums.length - 1];
        int idxHold = 0;
        //int min = nums[idxHold];


        for(int i = 1; i < nums.length; i ++){
            if(nums[idxHold] == nums[i]){
                nums[i] = maxNum + 1;
            } else {
                //min = nums[i];
                idxHold = i;
                count ++;
            }
        }

        bubbleSort(nums);
        return count;
    }

    public static void bubbleSort(int [] data){
        for (int n = 0; n < data.length - 1; n++) {
            for (int i = 0; i < data.length - 1 - n; i++) {     //  the condition is, data.length - 1 - n, because the largest number will be at
                //  the largest index every loop so this, - n, ignores the largest index for the inner for-loop
                if (data[i] > data[i + 1]) {    //  if left side is larger than right side than swap places
                    int temp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = temp;
                }

            }
        }
    }
}
