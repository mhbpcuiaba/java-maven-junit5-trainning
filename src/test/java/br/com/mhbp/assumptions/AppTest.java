package br.com.mhbp.assumptions;

import org.junit.jupiter.api.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class AppTest {

    @Test
    void test_On_Dev () {
        System.setProperty("ENV", "DEV");
        Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")), AppTest::message);
    }

    @Test
    void test_On_Hom() {
        System.setProperty("ENV", "HOM");
        Assumptions.assumeFalse("DEV".equals(System.getProperty("ENV")));
    }

    @DisplayName("my tes in prod")
    @Test
    void testOnProd() {
        System.setProperty("ENV", "PROD");
        Assumptions.assumeFalse("DEV".equals(System.getProperty("ENV")));
    }

    private static String message () {
        return "TEST Execution Failed :: ";
    }
}
