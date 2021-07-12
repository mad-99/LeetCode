class Solution {
    public boolean isHappy(int n) {
         int rem = 0, sum = 0;
        int count = 0;
        while (count < 10) {
            while (n > 0) {
                rem = n % 10;
                sum = sum + rem * rem;
                n = n / 10;
            }
            if (sum == 1) {
                return true;
            }
            n = sum;
            rem = 0;
            sum = 0;
            count++;
        }
        return false;
    
    }
}
