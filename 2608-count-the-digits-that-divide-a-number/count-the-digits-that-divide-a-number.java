class Solution {
    public int countDigits(int num) {
        int count = 0;
        int temp = num;

        while (temp > 0) {
            int last_digit = temp % 10;
            if (num % last_digit == 0) 
            {
                count++;
            }
            temp = temp / 10;
        }

        return count;
    }
}
