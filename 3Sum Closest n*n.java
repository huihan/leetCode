public class Solution {
    public int threeSumClosest(int[] num, int target) {
        Arrays.sort(num);
            
        int j ;
        int k ; 
        if (num.length < 3)
            return 0;
        int res = num[0] + num[1] + num[2];

        for(int i=0; i < num.length - 2; i++) {
            int temp = target-num[i];
            j = i+1;
            k = num.length - 1;
            while (j<k) {
                if (Math.abs(num[j] + num[k] + num[i] - target) < Math.abs(res - target) ) {
                    res = num[j] + num[k] + num[i];
                    i--;
                    break; 
                } else if (num[j] + num[k] < temp) {
                    j++;
                
                } else 
                    k--;
            }
        }
        return res;
    }
} 
