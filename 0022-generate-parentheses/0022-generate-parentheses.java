import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<String> generateParenthesis(int n) {
        return help("",n,n);
    }
    public List<String> help(String p,int cp,int op){
        if(cp==0&&op==0){
            List<String> l1 = new ArrayList<>();
            l1.add(p);
            return l1;
        }
        List<String> l= new ArrayList<>();
        if(cp>0){
            List<String> left=help(p+'(',cp-1,op);
            l.addAll(left);
        }
        if(cp<op){
            List<String> right=help(p+')',cp,op-1);
            l.addAll(right);
        }
        
        return l;
    }
}