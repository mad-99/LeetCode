import java.util.*;
class Solution {
    public int reverse(int x) {
        int rev =0;
        Math.abs(x);
        while(x!=0){
            rev = rev*10;
            rev+=  x%10;
            x/=10;
            
        }
        return rev;
    }
}
public class ReverseInteger{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Solution mad = new Solution();
        if(n==0 || n>=536871066){
            System.out.println("0");
        }
        else if(n>0 && n<536871066){
            System.out.println(mad.reverse(n));
        }
        else if(n<0){
            System.out.println("-"+(mad.reverse(n)));
        }
    }
}
