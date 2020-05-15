package br.com.mhbp.assumptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.fail;


public class SampleTest {

    //criar o template na IDE
    /*
    * usar @Before dps de mostrar repeticao de codigo!!!
    * @Before setup
    * @After teardown
    * timeout
    * */
    @Test
    public void test() {
        fail("Not implemented!!!");
    }

    @Test
    public void testArraySort() {
        int[] array = { 100, 90, 22, 10, 1_000, 500};
        int[] expected = { 10, 22, 90, 100, 500, 1_000};
        Arrays.sort(array);
        assertArrayEquals(expected, array);
    }

    @DisplayName("test Array Sort Throws NullPointerException For Array Null")
    @Test
    public void testArraySortThrowsExceptionForArrayNull() {
        int[] array = null;
        Assertions.assertThrows(NullPointerException.class, () ->{
            Arrays.sort(array);
        });
    }


    @Test
    public void testStringUpperCase() {

    }
}
