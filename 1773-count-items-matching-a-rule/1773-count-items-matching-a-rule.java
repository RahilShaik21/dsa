import java.util.*;
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
         int row;
        int count=0;
        if(ruleKey.contentEquals("color")){
            row=1;
        }else if(ruleKey.contentEquals("type")){
            row=0;
        }else{
            row=2;
        }
        for (int i = 0; i < items.size(); i++) {
            if((items.get(i).get(row)).contentEquals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}