class Solution {
    public int differenceOfSum(int[] nums) {
             int elementSum = 0;
        int digitSum = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            elementSum += num;

            while (num > 0) {
                int digit = num % 10;
                digitSum += digit;
                num /= 10;
            }
        }

        if (elementSum > digitSum) {
            return elementSum - digitSum;
        } else {
            return digitSum - elementSum;
        }
    }
}