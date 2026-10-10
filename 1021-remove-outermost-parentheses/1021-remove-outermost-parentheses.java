class Solution {
    public String removeOuterParentheses(String s) {
        int depth=0;
        StringBuilder str=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if(c=='('){
                if(++depth>1){
                    str.append(c);
                }
            }else{
                if(depth-->1)
                str.append(c);
            }
        }
        return str.toString();
    }
}