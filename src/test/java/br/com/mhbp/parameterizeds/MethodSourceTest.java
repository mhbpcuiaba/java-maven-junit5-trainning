package br.com.mhbp.parameterizeds;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MethodSourceTest {

    @ParameterizedTest
    @MethodSource("parameterProvider")
    void testWithSimpleMethodSource(String argument) {
        assertNotNull(argument);
    }

    // method name is the source to test
    static Stream<String> parameterProvider() {
        return Stream.of("parameter1", "parameter2");
    }
}
