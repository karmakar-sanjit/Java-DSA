import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();

        Map<Character, Integer> hmap = new TreeMap<>();
        int i = 0;
        while(i != ch.length) {
            if(!hmap.containsKey(ch[i])) {
                hmap.put(ch[i], 1);
            }
            else {
                int oldVal = hmap.get(ch[i]);
                int newVal = oldVal + 1;
                hmap.put(ch[i], newVal);
            }
            i++;
        }

        System.out.println(hmap);
    }
}
