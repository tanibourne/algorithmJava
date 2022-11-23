import java.util.*;

public class Solutions {

    public static String Dateyoung(int a, int b) {
        String answer = "";
        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] date = {"FRI", "SAT", "SUN",
                "MON", "TUE", "WED", "THU"};
        int calc = 0;
        if (a > 0) {
            for (int i = 0; i < a - 1; i++) {
                calc += days[i];
            }
        }
        calc += (b - 1);
        answer = date[(calc % 7)];
        return answer;
    }

    public static ArrayList<String> fourth(int a, String[] s){
        ArrayList<String> answer = new ArrayList<>();
        for(String x : s) {
            //StringBuilder 사용
//        String tmp = new StringBuilder(x).reverse().toString();
//        answer.add(tmp);
            char [] c = x.toCharArray();
            int lt = 0;
            int rt = x.length()-1;
            char tmp;

            while(lt < rt){
                tmp = c[lt];
                c[lt] = c[rt];
                c[rt] =tmp;
                lt++;
                rt--;
            }
            String tmp2 = String.valueOf(c);
            answer.add(tmp2);

        }
        return answer;
    }










}
