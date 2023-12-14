// 4A - Watermelon
import java.util.*;
public class Watermelon {
    public static void main(String[] args) {
        Scanner txt = new Scanner(System.in);
        int[] twoWeights = new int[2];
        int w = txt.nextInt();
        twoWeights[0]=w;
        twoWeights[1]=0;
        for (int i = 0; i < w; i++) {
            if (w>2){
                twoWeights[0]-=1;
                twoWeights[1]+=1;
                if (twoWeights[0]%2==0 && twoWeights[1]%2==0){
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }
}
