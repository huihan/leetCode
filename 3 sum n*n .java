{{{
import java.util.*;
public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Arrays.sort(num);
            
        int j ;
        int k ;
         Set set = new HashSet();
        //= num.length;
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if (num.length < 3)
            return res;

        for(int i=0; i < num.length - 2; i++) {
            int target = -num[i];
            j = i+1;
            k = num.length - 1;
            while (j<k) {
                if (num[j] + num[k] == target) {
                    ArrayList<Integer> sol = new ArrayList<Integer>();
                    sol.add(num[i]);
                    sol.add(num[j]);
                    sol.add(num[k]);
                    if (set.add(sol))
                        res.add(sol);
                    j++;
                    k--;
                } else if (num[j] + num[k] < target) {
                    j++;
                
                } else 
                    k--;
            }
        }
        return res;
    }
}
}}}
