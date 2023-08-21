import java.util.*;

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.toUpperCase();

        char[] ch = str.toCharArray();

        Map<Character, Integer> map = new LinkedHashMap<>();
        int i = 0;
        while(i != ch.length) {
            if(!map.containsKey(ch[i])) {
                map.put(ch[i], 1);
            }
            else {
                map.put(ch[i], map.get(ch[i]) + 1);
            }
            i++;
        }

        String ans = "";
        Set<Map.Entry<Character, Integer>> lmap = map.entrySet();
        for(Map.Entry<Character, Integer> data : lmap) {
            ans += data.getKey();
        }
        System.out.println(ans);
    }
}
