package br.com.mhbp.repeatedtest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RepeatedTestWithDisplayNameDemo {
    @RepeatedTest(name="{displayName} - {currentRepetition}/{totalRepetitions}",
            value = 5)
    @DisplayName("Repeated test")
    public void repeatedTestWithDisplayName() {
        assertTrue(0 < 5);
    }


}
