package helpers;

import org.apache.commons.lang3.RandomStringUtils;

public class TestData {
    public static String randomString(){
        int length = 10;
        boolean useLetters = true;
        boolean useNumbers = false;
        return RandomStringUtils.random(length, useLetters, useNumbers);
    }
}
