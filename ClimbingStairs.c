

int climbStairs(int n){
if(n == 1 || n ==2 ) return n;
        int a = 1;
        int b = 2;
        
        for(int i=3;i<=n;i++)
        {
            b = a+b;
            a = abs(a-b);
        }
        return b;
}
