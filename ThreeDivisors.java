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

// kotlin code .............................................

class Solution {
    fun isThree(n: Int): Boolean {
        var i=1;
        var count=0;
        while(n>=i){
            if(n%i==0)
                count++;
            i++;
        }
        if(count==3){
            return true;
        }
        else{
            return false;
        }
    }
}

