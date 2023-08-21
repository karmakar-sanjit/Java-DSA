import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MaximumOccuringChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.toUpperCase();

        char[] ch = str.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        while(i != ch.length) {
            if(!map.containsKey(ch[i])) {
                map.put(ch[i], 1);
            }
            else {
                int oldval = map.get(ch[i]);
                int newVal = oldval + 1;
                map.put(ch[i], newVal);
            }
            i++;
        }

        int Maxcount = 0;
        char maxOccur = ' ';
        Set<Map.Entry<Character, Integer>> hmap = map.entrySet();
        for(Map.Entry<Character, Integer> data: hmap) {
            if(data.getValue() > Maxcount) {
                Maxcount = data.getValue();
                maxOccur = data.getKey();
            }
        }
        System.out.println(maxOccur);
    }
}
