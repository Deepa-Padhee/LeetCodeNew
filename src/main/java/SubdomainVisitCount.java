import java.util.*;

public class SubdomainVisitCount {
    public static List<String> subdomainVisits(String[] cpdomains) {
        List<String> res = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        for (String domain : cpdomains){
            String str = domain;
            String[] splited = str.split("\\s+");
            String strIn = splited[1];
            String[] splitNew = strIn.split("\\.");
            StringBuilder sb = new StringBuilder();
            for (int i = splitNew.length-1;i>=0;i--){
                sb.insert(0,splitNew[i]);
                if (map.containsKey(sb.toString())){
                    map.replace(sb.toString(), map.get(sb.toString())+(Integer.valueOf(splited[0])));
                }
                else {
                    map.put(sb.toString(),Integer.valueOf(splited[0]));
                }
                sb.insert(0,'.');
            }
        }

        Iterator hmIterator = map.entrySet().iterator();

        while (hmIterator.hasNext()){
            StringBuilder sb = new StringBuilder();
            Map.Entry element = (Map.Entry) hmIterator.next();
            sb.append(element.getValue()).append(" ").append(element.getKey());
            res.add(sb.toString());
        }

        return res;
    }

    public static void main(String[] args) {
        String[] cpdomains = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        List<String> res = subdomainVisits(cpdomains);
        for (int i =0;i< res.size();i++){
            System.out.println(res.get(i));
        }
    }

}
