class Solution {
    public boolean isThree(int n) {
        int i=1,count=0;
        while(n>=i){
            if(n%i==0)
                count++;
            i++;
        }
        return((count==3) ?  true : false);
        // if(count==3){
        //     return true;
        // }
        // else{
        //     return false;
        // }
        
    }
}
// C code.........................................................



bool isThree(int n){
int i=1,count=0;
        while(n>=i){
            if(n%i==0)
                count++
            i++;
        }
        return((count==3) ?  true : false);
}

