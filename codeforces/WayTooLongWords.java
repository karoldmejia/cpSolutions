import java.util.*;
public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner txt = new Scanner(System.in);
        int n = txt.nextInt();
        txt.nextLine();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = txt.nextLine();
        }
        for (int i = 0; i < n; i++) {
            char[] chars = words[i].toCharArray();
            if (chars.length>10){
                System.out.println(chars[0] + String.valueOf(chars.length - 2) + chars[chars.length - 1]);
            } else {
                System.out.println(words[i]);
            }
        }
    }
}