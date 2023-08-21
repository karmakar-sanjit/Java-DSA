import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ch = str.toCharArray();

        Map<Character, Integer> hmap = new HashMap<>();
        int i = 0;
        while(i != ch.length) {
            if(!hmap.containsKey(ch[i])) {
                hmap.put(ch[i], 1);
            }
            else{
                int oldVal = hmap.get(ch[i]);
                int newVal = oldVal + 1;
                hmap.put(ch[i], newVal);
            }
            i++;
        }

        Set<Map.Entry<Character, Integer>> map = hmap.entrySet();
        for(Map.Entry<Character, Integer> data: map) {
            if(data.getValue() > 1) {
                System.out.println("All are not Unique Character");
                System.exit(0);
            }
        }


        System.out.println("All Unique Character");
    }
}
