import java.util.*;

class Solution {
    public int mySqrt(int x) {
        int oddN = 1,res = 0;
        while (x > 0) {
            x -= oddN;
            oddN += 2;
            res += x < 0 ? 0 : 1;
        }
        return res;
    }
}

public class sqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Solution111 t = new Solution();
        System.out.println(t.mySqrt(x));
    }
}
