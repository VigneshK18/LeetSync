class Solution {
    public int smallestNumber(int num, int t) {
            
            while (true) {
            int product = 1;
            int n = num;

            // Calculate product of digits
            while (n > 0) {
                product *= (n % 10);
                n /= 10;
            }

            // Check divisibility
            if (product % t == 0) {
                return num;
            }

            num++;
        }
    }
}