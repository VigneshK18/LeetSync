class Solution {
    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int last = x % 10;
            x /= 10;

            // Check for overflow
            if (rev > Integer.MAX_VALUE / 10 ||
               (rev == Integer.MAX_VALUE / 10 && last > 7))
                return 0;

            // Check for underflow
            if (rev < Integer.MIN_VALUE / 10 ||
               (rev == Integer.MIN_VALUE / 10 && last < -8))
                return 0;

            rev = rev * 10 + last;
        }

        return rev;
    }
}

/*class Solution{
    public int reverse(int x){
        int rev = 0;
        while(x!=0){
            int last = x%10;
            rev = rev*10+last;
            x=x%10;
        }
        rev = rev/10;
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
            return 0;
        }
        if(x<0){
            return (int)(-1*rev);
        }
        return (int)rev;
    }
}

class Solution {
    public int reverse(int x) {
        int rev = 0;
        boolean negative = false;

        if (x < 0) {
            negative = true;
            x = -x;
        }

        while (x > 0) {
            int last = x % 10;
            rev = rev * 10 + last;
            x = x / 10;
        }

        if (negative) {
            rev = -rev;
        }

        return rev;
    }
}*/