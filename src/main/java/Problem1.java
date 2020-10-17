/*
    Nam Nguyen
    October 19, 2020
    CS 143B
    Homework_2
 */

public class Problem1 {

    /*
    Describe your algorithm here in up to 5 sentences:

    While iterating through the array, I created 3 nested if-statements for each color (0,1,2). I've also created a variable
    called lastIdx which is assigned to the value of the array length - 1. If 'i' is 2 than it compares 2 to the number of the
    lastIdx, if it's 0 or 1 than switch places and update lastIdx by  - 1. If 'i' is 0 and the index is larger than 0, than it
    looks back at the previous index to check if there is a 1, if so than swap places. if 'i' is 1 than it looks at the next index
    and swaps places if it's a 0.
     */

    // Do not change signature (function name, parameters type, and return type)
    public static void colorSort(int[] nums) {
        int lastIdx = nums.length - 1;

        for(int i = 0; i < nums.length - 1; i ++){

            if(nums[i] == 2){
                if(nums[lastIdx] == 0){
                    nums[i] = 0;
                    nums[lastIdx] = 2;
                    lastIdx --;
                } else if(nums[lastIdx] == 1 && i < (nums.length / 2)){
                    //  i < (nums.length / 2)  is here to ensure that 2 doesn't swap with 1 if the index is beyond the first half of the array
                    //  if we did not have this than, 2 could possibly swap back to 1 and ruin the order
                    nums[i] = 1;
                    nums[lastIdx] = 2;
                    lastIdx --;
                }
            }

            if(nums[i] == 1){
                if(nums[i + 1] == 0){
                    nums[i] = 0;
                    nums[i + 1] = 1;
                }
            }

            if(nums[i] == 0 && i > 0){
                if(nums[i - 1] == 1){
                    nums[i] = 1;
                    nums[i - 1] = 0;
                }
            }

        }

    }
}
