public class Solution {
    public void wiggleSort(int[] nums) {
        for(int i = 0; i < nums.length-1; i++){
            if((i % 2 == 1) == (nums[i] < nums[i+1])){
                int tmp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = tmp;
            }
        }
    }
}