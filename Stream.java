import java.util.Scanner;

public class Stream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String unprocessed = sc.next();
        //String processed = "";
        //skip(unprocessed, processed);
        //System.out.println(skip(unprocessed));
        //System.out.println(substringSkip(unprocessed));
        System.out.println(substringSkipWithCondition(unprocessed));
    }

    public static void skip(String unprocessed, String processed) {
        if(unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        if(ch == 'a') {
            skip(unprocessed.substring(1), processed );
        }
        else {
            skip(unprocessed.substring(1), processed + ch);
        }

    }


    public static String skip(String unprocessed) {
        if(unprocessed.isEmpty()){
            return "";
        }

        char ch = unprocessed.charAt(0);
        if (ch == 'a') {
            return skip(unprocessed.substring(1));
        }
        else {
            return ch + skip(unprocessed.substring(1));
        }
    }

    public static String substringSkip(String unprocessed) {
        if(unprocessed.isEmpty()){
            return "";
        }

        char ch = unprocessed.charAt(0);

        if(unprocessed.startsWith("apple")){
            return substringSkip(unprocessed.substring(5));
        }
        else {
            return ch + substringSkip(unprocessed.substring(1));
        }
    }

    public static String substringSkipWithCondition(String unprocessed) {
        if(unprocessed.isEmpty()){
            return "";
        }

        char ch = unprocessed.charAt(0);

        if(unprocessed.startsWith("app") && !unprocessed.startsWith("apple")){
            return substringSkipWithCondition(unprocessed.substring(3));
        }
        else {
            return ch + substringSkipWithCondition(unprocessed.substring(1));
        }
    }
}
