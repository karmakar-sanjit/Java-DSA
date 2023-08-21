import javax.xml.transform.sax.SAXSource;
import java.sql.SQLOutput;
import java.util.*;

public class FirstNonRepeatedChar {
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
                int oldVal = map.get(ch[i]);
                int newVal = oldVal + 1;
                map.put(ch[i], newVal);
            }
            i++;
        }

        Set<Map.Entry<Character, Integer>> lmap = map.entrySet();
        for(Map.Entry<Character, Integer> data : lmap) {
            if(data.getValue() == 1){
                System.out.println(data.getKey());
                System.exit(0);
            }
        }
        System.out.println("Nothing");
    }
}
