package b25.bookit;

import org.junit.jupiter.api.Test;
import utilities.ConfigReader;

public class BookitEnvTest {

    @Test
    public void test1(){

        System.out.println(ConfigReader.getProperty("base_url"));
        System.out.println(ConfigReader.getProperty("teacher_email"));
        System.out.println(ConfigReader.getProperty("teacher_password"));

    }



}
