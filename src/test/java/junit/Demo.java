package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Demo {


    @Test
    public void test1() {
        System.out.println("This is test 1  ");
    }

    public boolean catdog(String str) {
//        if (str.contains("cat") && str.contains("dog")){
//
//            return true;
//        }
//        else{
//            return false;
        //  }
        int countcat = 0;
        while (str.contains("cat")) {
            str = str.replace("cat", "");
            countcat++;

        }
        int countdog = 0;
        while (str.contains("dog")) {
            str = str.replace("dog", "");
            countdog++;

        }
        if (countcat != 0 && countdog != 0) {
            if (countcat == countdog) {
                return true;
            } else {
                return false;
            }
        }

        return false;
    }
    @Test
    public void testcatdog(){
        String str1 = "catdog";
        boolean expectedValue1 = true;
        String str2 = "catcat";
        boolean expectedValue2 = false;
        String str3 = "1cat1cadodog";
        boolean expectedValue3 = true;
        Assertions.assertEquals(expectedValue1,catdog(str1));
        Assertions.assertEquals(expectedValue2,catdog(str2));
        Assertions.assertEquals(expectedValue3,catdog(str3));
    }
}

