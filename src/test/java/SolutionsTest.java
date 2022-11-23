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
}