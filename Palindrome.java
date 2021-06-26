class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        StringBuffer sb = new StringBuffer(s);
        String b = sb.reverse().toString();
        if(s.equals(b)){
            return true;
        }
        else{
            return false;
        }
    }
}
public class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        Solution so = new Solution();
        System.out.println(so.isPalindrome(n));
    }
}



/*import java.util.*;
import java.io.*;
class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        StringBuffer sb = new StringBuffer(s);
        String b = sb.reverse().toString();
        return(s.equals(b) ? true : false);
    }
}
public class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        Solution so = new Solution();
        System.out.println(so.isPalindrome(n));
    }
}*/
