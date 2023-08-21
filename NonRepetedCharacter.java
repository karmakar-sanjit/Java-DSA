import java.util.*;

public class NonRepetedCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.toUpperCase();

        char[] ch = str.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        while(i != ch.length) {
            if(!map.containsKey(ch[i])){
                map.put(ch[i], 1);
            }
            else {
                int oldVal = map.get(ch[i]);
                int newVal = oldVal + 1;
                map.put(ch[i], newVal);
            }
            i++;
        }

        int count = 0;
        ArrayList<Character> list = new ArrayList<>();
        Set<Map.Entry<Character, Integer>> hmap = map.entrySet();
        for (Map.Entry<Character, Integer> data: hmap ) {
            if(data.getValue() == 1) {
                list.add(data.getKey());
                count++;
            }
        }
        System.out.println(count);
        System.out.println(list);
    }
}
