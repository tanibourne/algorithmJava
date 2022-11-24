
import java.util.*;

public class Inflearns {

    public static String fifth(String s) {
        String answer = "";
        char [] c = s.toCharArray();

        int lt = 0;
        int rt = s.length() -1;
        char tmp;


        while(lt < rt){
            if( 'A' <= c[lt] || 'Z' >= c[])
            tmp = c[lt];
            c[lt] = c[rt];
            c[rt] =tmp;
            lt++;
            rt--;

        }



        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(Inflearns.fifth(str));


    }
}
