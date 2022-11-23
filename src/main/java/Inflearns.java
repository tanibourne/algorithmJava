import java.util.ArrayList;
import java.util.Scanner;

public class Inflearns {

    public static ArrayList<String> fourth(int a, String[] s){
    ArrayList<String> answer = new ArrayList<>();

    return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String[] s = new String [a];
        for(int i = 0; i < a ; i++){
            s[i] = sc.next();
        }
        for(String str : Inflearns.fourth(a,s)){

            System.out.println(str);
        }



    }
}
