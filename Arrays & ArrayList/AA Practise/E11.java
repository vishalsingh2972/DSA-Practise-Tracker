import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/count-items-matching-a-rule/
public class E11 {
    public static void main(String[] args) {

        List<String> first = new ArrayList<>(); //internal arraylist (child arraylist present inside parent arraylist)
        first.add("phone");
        first.add("blue");
        first.add("pixel");

        List<String> second = new ArrayList<>(); //internal arraylist (child arraylist present inside parent arraylist)
        second.add("computer");
        second.add("silver");
        second.add("phone");

        List<String> third = new ArrayList<>(); //internal arraylist (child arraylist present inside parent arraylist)
        third.add("phone");
        third.add("gold");
        third.add("iphone");
//        System.out.println(third);
//        System.out.println(third.get(1));

        List<List<String>> items = new ArrayList<>(); //EXTERNAL arraylist (Parent arraylist)
        items.add(first);
        items.add(second);
        items.add(third);
        System.out.println(items);
//        System.out.println(items.get(1));
//        System.out.println(items.get(1).get(2));

        String ruleKey = "type";
        String ruleValue = "phone";

        System.out.println(countMatches(items,ruleKey,ruleValue));
        
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;

        for(int i = 0 ; i < items.size(); i++) {
                if(ruleKey.equals("type")) { //.get(0) == type being checked at 1st index position only for each internal arraylist/child arraylist. Basically if ruleKey ="type", then ruleValue value is being checked at 1st index position only for each internal arraylist/child arraylist
                    if(items.get(i).get(0).equals(ruleValue))
                        count++;
                    continue;
                }
            if(ruleKey.equals("color")) { //.get(1) == color being checked at 2nd index position only for each internal arraylist/child arraylist. Basically if ruleKey ="color", then ruleValue value is being checked at 2nd index position only for each internal arraylist/child arraylist
                if(items.get(i).get(1).equals(ruleValue))
                    count++;
                continue;
            }

            if(ruleKey.equals("name")) { //.get(2) == name being checked at 3rd index position only for each internal arraylist/child arraylist. Basically if ruleKey ="name", then ruleValue value is being checked at 3rd index position only for each internal arraylist/child arraylist
                if(items.get(i).get(2).equals(ruleValue))
                    count++;
            }
        }
        return count;
    }
}
