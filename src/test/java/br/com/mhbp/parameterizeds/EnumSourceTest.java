package br.com.mhbp.parameterizeds;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EnumSourceTest {

    @ParameterizedTest
    @EnumSource(Animal.class)
    void testEnumSource(Animal animal) {
        assertNotNull(animal);
    }

}

enum Animal {
    ELEPHANT,
    TIGER,
    DOG,
    CAT,
    MOUSE
}