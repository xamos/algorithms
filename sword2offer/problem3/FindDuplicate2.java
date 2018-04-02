public class Solution {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers==null || length<=0)
            return false;
        for(int i=0; i<length-1; i++){
            if(numbers[i]>length-1 || numbers[i]<0)
                return false;
        }
        //哈希表法
        boolean[] hash = new boolean[length];
        for(int i=0; i<length; i++){
            if(hash[numbers[i]]==true){
                duplication[0] = numbers[i];
                return true;
            }
            hash[numbers[i]] = true;
        }
        return false;
    }
}