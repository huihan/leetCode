import java.util.Stack;
public class Solution {
    public boolean isValid(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(s == null || s.length() <=1) return false;
        
        Stack<Character> st= new Stack<Character>();
        
        int k = 0;
        while(k< s.length())
        {
            switch(s.charAt(k))
            {
                case '(':
                    st.push('(');
                    break;
                    
                case '[':
                    st.push('[');
                    break;
                    
                case '{':
                    st.push('{');
                    break;
                case ')':
                    if(st.empty()) return false;
                    if(st.pop()!='(') return false;
                    break;
                case ']':
                    if(st.empty()) return false;
                    if(st.pop()!='[') return false;
                    break;
                case '}':
                    if(st.empty()) return false;
                    if(st.pop()!='{') return false;
                    break;
            }
            k++; 
        }
        if(!st.empty()) return false;
        return true;
    }
}
