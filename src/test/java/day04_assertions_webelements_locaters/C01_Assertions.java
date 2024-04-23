package day04_assertions_webelements_locaters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class C01_Assertions {
    /*
    Junit 5 te Assertion yaomak icin Assertion classi kullanilir
    Junut 4 te Assert classi kullanilir
    */

    @Test
    void test01() {
        Assertions.assertEquals(3,3);

    }

    @Test
    void test02() {
        Assertions.assertTrue(2<5);
    }

    @Test
    void test03() {
        Assertions.assertFalse("selenium".contains("junit"));
    }

    @Test
    void test04() {
        Assertions.assertNotEquals("selenium","junit");
    }
    //Not : İki array in birbirine esit olabilmesi icin ayni indexte ayni elemanlarin olmasi gerekir

    @Test
    void test05() {
        char [] expectedArray ={'j','u','n','i','t'};
        char [] actualArray ={'j','u','n','t','i'};
        Assertions.assertArrayEquals(expectedArray,actualArray);
    }

    @Test
    void test06() {
        String str=null;
        Assertions.assertNull(str);
    }

    @Test
    void test07() {
        String str="selenium";
        Assertions.assertNotNull(str); //eger bekleen deger null degilse test gecer degilse test kalir

    }
}
