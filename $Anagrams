import  java.util.Hashtable;
public class Solution {
    Hashtable<String, ArrayList<String>> ht ;
    public ArrayList<String> anagrams(String[] strs) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ht  = new Hashtable<String, ArrayList<String>>(); 
        ArrayList<String> res = new ArrayList<String>();
        for(int i = 0 ; i < strs.length ; i++)
        {
            refresh(strs[i] , i);
        }
        for( ArrayList<String> list : ht.values() )
        {
            if(list.size() > 1)
               res.addAll(list);
        }
        return res;
    }
    private void refresh(String str , int num)
    {
        int[] list = new int[26];
        for(int i = 0 ; i < 26 ; i++)
        {
            list[i] = 0;
        }
        for(int i = 0 ; i < str.length() ; i++)
        {
            list[str.charAt(i) - 'a']++;
        }
        String list_str =list_to_string(list);
        if(ht.containsKey(list_str))
        {
            ht.get(list_str).add(str);
        }
        else
        {
            ArrayList<String> arr = new ArrayList<String>();
            arr.add(str);
            ht.put(list_str , arr);
        }
        
    }
    private String  list_to_string( int[] list)
    {
        String str = new String();
        for(int i = 0 ; i < list.length ; i++)
        {
            str+="," + list[i] ;
        }
        return str;
    }
   
}
