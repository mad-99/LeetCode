class Solution {
    public int findSpecialInteger(int[] arr) {
        int after = arr.length /4;
        for(int i=0;after<arr.length;i++,after++)
        {
            if(arr[i]==arr[after]){
                return arr[i];
            }
        }
        return -1;
    }
}