import java.util.Scanner;
import java.util.ArrayList;

public class RemovalOfUnattractivePairs {
    public static void main(String[] args) {
        Scanner txt = new Scanner(System.in);
        int t = txt.nextInt(); // number of test cases
        String[] ss = new String[t];

        for (int i = 0; i < t; i++) {
            int n = txt.nextInt();
            String s = txt.next();
            ss[i] = n>=2 && n==s.length() ? s : null;
        }
        for (String s: ss) {
            ArrayList<Character> chars  = new ArrayList<>();
            ArrayList<Character> charsOrganized  = new ArrayList<>();
            if (s!=null) {
                for (char c : s.toCharArray()) {
                    chars.add(c);
                }
                System.out.println(chars);
                while (!chars.isEmpty()){
                    char tempC = chars.get(0);
                    System.out.println(tempC);
                    for (int j = 0; j < chars.size(); j++) {
                        if (chars.get(j) == tempC) {
                            charsOrganized.add(chars.get(j));
                            chars.remove(j);
                            j--; // para el siguiente día, entender el por qué esto es necesario
                        }
                        System.out.println(chars);
                        System.out.println(charsOrganized);
                    }
                }
            }
        }
    }
}

/*
public class RemovalOfUnattractivePairs {
    public static void main(String[] args) {
        Scanner txt = new Scanner(System.in);
        int t = txt.nextInt(); // number of test cases
        String[] ss = new String[t];

        for (int i = 0; i < t; i++) {
            int n = txt.nextInt();
            String s = txt.next();
            ss[i] = n>=2 && n==s.length() ? s : null;
        }
        for (String s: ss) {
            ArrayList<Character> chars  = new ArrayList<>();
            if (s!=null) {
                for (char c : s.toCharArray()) {
                    chars.add(c);
                }
                for (int i = 0; i < chars.size() - 1; ) {
                    if (chars.get(i) != chars.get(i+1)) {
                        chars.remove(i + 1);
                        chars.remove(i);
                    } else {
                        i++;
                    }
                }
            }
            System.out.println(chars);
            System.out.println(chars.size());
        }
    }
}
*/
