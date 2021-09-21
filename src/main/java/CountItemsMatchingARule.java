import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountItemsMatchingARule {
    public static int countMatchesDidNotWork(List<List<String>> items, String ruleKey, String ruleValue) {
        int result =0;
        HashMap<String,String> map = new HashMap<>();
        for (List<String> singleArray : items){
            for (int i =0; i<singleArray.size();i++){
                if (i == 0){
                map.put("type",singleArray.get(i));
                }
                if (i==1){
                map.put("color",singleArray.get(i));
                }
                if (i==2){
                map.put("name",singleArray.get(i));
                }
            }
            if (map.get(ruleKey) == ruleValue){
                result = result+1;
            }
        }
        return result;
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int result =0;
        HashMap<String,Integer> map = new HashMap<>();
        map.put("type",0);
        map.put("color",1);
        map.put("name",2);
        for (List<String> singleArray : items){
            if (ruleValue.equals(singleArray.get(map.get(ruleKey)))){
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<List<String>> listOfLists = new ArrayList<>();
                //{{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}};
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("phone");
        list1.add("blue");
        list1.add("pixel");
        listOfLists.add(list1);

        ArrayList<String> anotherList = new ArrayList<String>();
        anotherList.add("computer");
        anotherList.add("silver");
        anotherList.add("lenovo");
        listOfLists.add(anotherList);

        ArrayList<String> anotherList1 = new ArrayList<String>();
        anotherList1.add("phone");
        anotherList1.add("gold");
        anotherList1.add("iphone");
        listOfLists.add(anotherList1);

        String rulekey = "type";
        String rulevalue = "phone";
        int result = countMatches(listOfLists,rulekey,rulevalue);
        System.out.println(result);
    }
}
