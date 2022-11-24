import org.junit.jupiter.api.Test;


import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionsTest {

    @Test
    void dateyoung() {

        String result = Solutions.Dateyoung(5, 24);
        System.out.println(result);
    }


    @Test
    void fourth() {

        ArrayList<String> result = Solutions.fourth(3, new String[]{"good", "Time", "Big"});
        System.out.println(result);
    }

    @Test
    void zumSecond() {

        int [][] test = {{1, 0, 5},{2, 2, 2},{3, 3, 1},{4, 4, 1},{5, 10, 2}};

        int [] result = Solutions.zumSecond(test);

        System.out.println(Arrays.toString(result));
    }
}