class Solution {
    public String sortSentence(String s) {
   String[] arr=s.split(" ");
        int[] idx=new int[9];
        StringBuilder str=new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            int digit=arr[i].charAt(arr[i].length()-1)-'0';
            idx[digit-1]=i;
        }
        for (int i = 0; i < arr.length; i++) {
            String temp=arr[idx[i]].substring(0,arr[idx[i]].length()-1);
            str.append(temp);
            if(i<arr.length-1){
                str.append(" ");
            }
        }
        return str.toString();
    }
}