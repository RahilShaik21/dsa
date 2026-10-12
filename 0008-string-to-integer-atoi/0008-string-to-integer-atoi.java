class Solution {
    public int myAtoi(String s) {
       int n=s.length();
        long value=0;
       int i=0;
       int sign=1;
       while(i<n&&s.charAt(i)==' '){
           i++;
       }
       if(i<n&&(s.charAt(i)=='+'||s.charAt(i)=='-')){
           if(s.charAt(i)=='-'){
               sign=-1;
           }
           i++;
       }
       while(i<n&&(s.charAt(i)>='0'&&s.charAt(i)<='9')){
           int ch=s.charAt(i)-'0';
           value=value*10+ch;
           if(sign*value>Integer.MAX_VALUE){
               return Integer.MAX_VALUE;
           }
           if(sign*value<Integer.MIN_VALUE){
               return Integer.MIN_VALUE;
           }
           i++;
       }
       return (int)(sign*value);
    }
}