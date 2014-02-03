import java.util.*;
public class Solution {
    public void nextPermutation(int[] num) {
        if(num.length <= 1) return;
        int breakpoint = findBreakPoint( num);
        if(breakpoint < 0) {
            reverse(num , 0 , num.length -1);
            return;
        }
        int index = binarySearch( num, breakpoint+1 , num.length-1 ,num[breakpoint]);
        ArraySwap(num, breakpoint, index);
        reverse(num , breakpoint+1 , num.length - 1);
    }
    public void reverse(int [] num , int start , int end){
        int p = start , q = end;
        int temp= 0;
        while(p < q){
            temp= num[p];
            num[p++]= num[q];
            num[q--] = temp;
        }
    }
    public int binarySearch(int[] num , int p , int q, int target){
        if(p >= q) return p;
        int mid = (p+q)/2;
        if(num[mid] >target){
            if(num[mid+1] <= target) return mid;
            return binarySearch(num, mid+1 , q , target);
        }
        if(num[mid] <= target){
            return binarySearch(num,p , mid -1 , target);
        }
        return 0;
    }
    public static void ArraySwap(int[] num , int p , int q){
        int temp = num[p];
        num[p] = num[q];
        num[q] = temp;
    }
    public int findBreakPoint(int[] num){
        for(int i = num.length -1 ; i >0 ;i--){
            if(num[i-1] >= num[i]) continue;
            return i-1;
        }
        return -1;
    }
}
