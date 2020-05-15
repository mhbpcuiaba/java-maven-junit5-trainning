package br.com.mhbp.hamcrest;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class HamcrestAssertionsDemo {

    @Test
    void assertWithHamcrestMatcher() {
        assertThat(Math.subtractExact(4, 1), is(equalTo(3)));
    }

    @Disabled("Disabled until bug #99 has been fixed")
    @Test
    void test() {

    }

}
