/*
    Nam Nguyen
    October 19, 2020
    CS 143B
    Homework_2
 */

public class Problem2 {

    /*
    Describe your algorithm here in up to 5 sentences:

    I created a for loop going through the whole array and 'i' is starting from 1. It starts at 1 because my index
    variable holder is starting at 0 to compare the two. It compares each number to see if they're equal, if they
    are equal than it makes the value at the 'i' index the largest number, array[array.length - 1] + 1, if they are not
    equal than my index variable holder becomes i and the process repeats. When the process is finished all the
    duplicate numbers will be the same number, array[array.length - 1] + 1. Lastly, I put the array through a bubble
    sort to move all the duplicate numbers to the end.
     */

    // Do not change signature (function name, parameters and return type)
    // Do not use extra space for another array. Solution to be in-pace with O(1) extra memory
    public static int remove(int[] nums) {
        if(nums == null || nums.length == 0){   //  filters the given Array
            return 0;
        }

        int count = 1;                          //  count starts at 1 because the Array must contain 1 element after being filtered
        int maxNum = nums[nums.length - 1];
        int idxHold = 0;

        for(int i = 1; i < nums.length; i ++){
            if(nums[idxHold] == nums[i]){
                nums[i] = maxNum + 1;           //  current value at 'i' index becomes largest number in new Array
            } else {
                idxHold = i;                    //  idxHold = 'i', if they're no more duplicates of previous 'i' value
                count ++;
            }
        }

        bubbleSort(nums);
        return count;
    }

    public static void bubbleSort(int [] data){
        for (int n = 0; n < data.length - 1; n++) {
            for (int i = 0; i < data.length - 1 - n; i++) {     //  the condition is, data.length - 1 - n, because that's where the largest number is
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
