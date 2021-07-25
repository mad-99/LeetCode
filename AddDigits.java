// class Solution {
//     public int addDigits(int num) { 
//         int div=0,sum=0,temp=0;
//         int len = String.valueOf(num).length();
//         while(len>0){
//         while(num!=0 ){
//             div=num%10;
//             sum=sum+div;
//             num=num/10;
//         }
//         num=temp=sum;
//         sum=0;
//         len--;
//     }
//         if(sum==0){
//             return temp;
//         }
//         else{
//             return sum;
//         }
        
//     }
// }
class Solution {
    public int addDigits(int num) {
        return (1 + ((num - 1) % 9));
    }
}
